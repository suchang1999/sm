package org.framestudy.spring_mybatis.relationmag.mapper;

import org.framestudy.spring_mybatis.relationmag.beans.Wife;

public interface WifeMapper {
	public Wife getWifeWithHusbandByWifeId(int id);	//根据妻子id查询妻子与丈夫
}
