package org.jzw.yxbs.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.jzw.yxbs.condition.MessageCondition;
import org.jzw.yxbs.dao.BBSMessageDao;
import org.jzw.yxbs.domain.Message;
import org.jzw.yxbs.service.BBSMessageService;
import org.springframework.stereotype.Service;

@Service("bbsMessageService")
public class BBSMessageServiceImpl implements BBSMessageService {
	
	@Resource
	private BBSMessageDao messageDao;

	@Override
	public List<Message> selectMessages(MessageCondition mc) {
		List<Message> listMsgList = new ArrayList<Message>();
		listMsgList = messageDao.selectMessages(mc);
		return listMsgList;
	}

	@Override
	public Integer selectCount(MessageCondition mc) {
		Integer count = messageDao.selectCount(mc);
		return count;
	}

	@Override
	public void insert(Message m) {
		messageDao.insert(m);
	}

}
