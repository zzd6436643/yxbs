package org.jzw.yxbs.dao;

import java.util.List;

import org.jzw.yxbs.annotation.MyBatisRepository;
import org.jzw.yxbs.domain.Section;

@MyBatisRepository
public interface BBSSectionDao {

	public List<Section> findAllSection();
}
