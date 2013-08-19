package org.jzw.yxbs.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.jzw.yxbs.dao.BBSSectionDao;
import org.jzw.yxbs.domain.Section;
import org.jzw.yxbs.service.BBSSectionService;
import org.springframework.stereotype.Service;

@Service("bbssectionService")
public class BBSSectionServiceImpl implements BBSSectionService {
	private static final Logger LOGGER = Logger.getLogger(BBSSectionServiceImpl.class);

	@Resource
	private BBSSectionDao sectionDao;
	
	@Override
	public List<Section> findAllSection() {
		List<Section> list = new ArrayList<Section>();
		list = sectionDao.findAllSection();
		LOGGER.debug("section's size is " + list.size());
		return list;
	}

}
