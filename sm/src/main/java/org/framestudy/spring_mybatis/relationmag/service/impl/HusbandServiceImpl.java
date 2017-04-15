package org.framestudy.spring_mybatis.relationmag.service.impl;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis.relationmag.beans.HusBand;
import org.framestudy.spring_mybatis.relationmag.dao.IHusbandDao;
import org.framestudy.spring_mybatis.relationmag.service.IHusbandService;
import org.springframework.stereotype.Service;

@Service
public class HusbandServiceImpl implements IHusbandService {
	
	@Resource
	private IHusbandDao husbandDaoImpl;
	
	public int marry(HusBand hus) {
		// TODO Auto-generated method stub
		return husbandDaoImpl.marry(hus);
	}

	public HusBand getHusbandWithWifeByHusbandId(int id) {
		// TODO Auto-generated method stub
		return husbandDaoImpl.getHusbandWithWifeByHusbandId(id);
	}

	public int deleteHusbandWithWifeByHusbandId(int id) {
		// TODO Auto-generated method stub
		return husbandDaoImpl.deleteHusbandWithWifeByHusbandId(id);
	}

}
