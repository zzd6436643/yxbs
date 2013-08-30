package org.jzw.yxbs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.jzw.yxbs.condition.ReplyCondition;
import org.jzw.yxbs.dao.BBSReplyDao;
import org.jzw.yxbs.domain.Reply;
import org.jzw.yxbs.service.BBSReplyService;
import org.springframework.stereotype.Service;

@Service("bbsReplyService")
public class BBSReplyServiceImpl implements BBSReplyService {
	
	@Resource
	private BBSReplyDao replyDao;

	@Override
	public Integer selectReplyCount(ReplyCondition rc) {
		return replyDao.selectReplyCount(rc);
	}

	@Override
	public List<Reply> selectReply(ReplyCondition rc) {
		return replyDao.selectReply(rc);
	}

	@Override
	public void insertReply(ReplyCondition rc) {
		replyDao.insertReply(rc);
	}

}
