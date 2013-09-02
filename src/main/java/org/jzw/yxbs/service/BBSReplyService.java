package org.jzw.yxbs.service;

import java.util.List;

import org.jzw.yxbs.condition.ReplyCondition;
import org.jzw.yxbs.domain.Reply;

public interface BBSReplyService {
	public Integer selectReplyCount(ReplyCondition rc);
	
	public List<Reply> selectReply(ReplyCondition rc);
	
	public void insertReply(ReplyCondition rc);

}
