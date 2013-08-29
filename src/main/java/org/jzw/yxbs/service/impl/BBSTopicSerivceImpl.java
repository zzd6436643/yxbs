package org.jzw.yxbs.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.jzw.yxbs.condition.TopicCondition;
import org.jzw.yxbs.dao.BBSTopicDao;
import org.jzw.yxbs.domain.Topic;
import org.jzw.yxbs.service.BBSTopicService;
import org.springframework.stereotype.Service;

@Service("bbstopicService")
public class BBSTopicSerivceImpl implements BBSTopicService {
	
	@Resource
	private BBSTopicDao topicDao;

	@Override
	public List<Topic> findTopics(TopicCondition tc) {
		List<Topic> list = new ArrayList<Topic>();
		list = topicDao.selectTopic(tc);
		return list;
	}

}
