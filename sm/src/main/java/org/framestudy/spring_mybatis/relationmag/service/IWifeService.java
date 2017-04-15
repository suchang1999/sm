package org.framestudy.spring_mybatis.relationmag.service;

import org.framestudy.spring_mybatis.relationmag.beans.Wife;

public interface IWifeService {
	public Wife getWifeWithHusbandByWifeId(int id);	//根据妻子id查询妻子与丈夫
}
