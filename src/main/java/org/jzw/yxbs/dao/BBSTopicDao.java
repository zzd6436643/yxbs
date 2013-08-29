package org.jzw.yxbs.dao;

import java.util.List;

import org.jzw.yxbs.annotation.MyBatisRepository;
import org.jzw.yxbs.condition.TopicCondition;
import org.jzw.yxbs.domain.Topic;

@MyBatisRepository
public interface BBSTopicDao {
	
	public List<Topic> selectTopic(TopicCondition topicCondition);

}
