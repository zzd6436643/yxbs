package org.jzw.yxbs.dao;

import java.util.List;

import org.jzw.yxbs.annotation.MyBatisRepository;
import org.jzw.yxbs.condition.MessageCondition;
import org.jzw.yxbs.domain.Message;

@MyBatisRepository
public interface BBSMessageDao {
	public List<Message> selectMessages(MessageCondition mc);
	
	public Integer selectCount(MessageCondition mc);
	
	public void insert(Message msg);

}
