package org.framestudy.spring_mybatis.relationmag.dao.impl;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis.relationmag.beans.HusBand;
import org.framestudy.spring_mybatis.relationmag.dao.IHusbandDao;
import org.framestudy.spring_mybatis.relationmag.mapper.HusbandMapper;
import org.springframework.stereotype.Repository;

@Repository
public class HusbandDaoImpl implements IHusbandDao {
	
	@Resource
	private HusbandMapper hm;
	
	public int marry(HusBand hus) {
		// TODO Auto-generated method stub
		return hm.marry(hus);
	}

	public HusBand getHusbandWithWifeByHusbandId(int id) {
		// TODO Auto-generated method stub
		return hm.getHusbandWithWifeByHusbandId(id);
	}

	public int deleteHusbandWithWifeByHusbandId(int id) {
		// TODO Auto-generated method stub
		return hm.deleteHusbandWithWifeByHusbandId(id);
	}

}
