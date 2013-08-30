package org.jzw.yxbs.dao;

import java.util.List;

import org.jzw.yxbs.annotation.MyBatisRepository;
import org.jzw.yxbs.condition.ReplyCondition;
import org.jzw.yxbs.domain.Reply;

@MyBatisRepository
public interface BBSReplyDao {
	public Integer selectReplyCount(ReplyCondition rc);
	
	public List<Reply> selectReply(ReplyCondition rc);
	
	public void insertReply(ReplyCondition rc);
}
