package org.jzw.yxbs.service;

import java.util.List;

import org.jzw.yxbs.condition.TopicCondition;
import org.jzw.yxbs.domain.Topic;

/**
 * 主题部分
 * 
 * @author mOnsoOn
 *
 */
public interface BBSTopicService {

	public List<Topic> findTopics(TopicCondition tc);
	
}
