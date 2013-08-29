package org.jzw.yxbs.service;

import java.util.List;

import org.jzw.yxbs.condition.MessageCondition;
import org.jzw.yxbs.domain.Message;

public interface BBSMessageService {

	public List<Message> selectMessages(MessageCondition mc);
	
	public Integer selectCount(MessageCondition mc);
	
	public void insert(Message m);
}
