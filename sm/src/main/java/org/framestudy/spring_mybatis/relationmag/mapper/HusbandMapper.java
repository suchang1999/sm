package org.framestudy.spring_mybatis.relationmag.mapper;

import org.apache.ibatis.annotations.Param;
import org.framestudy.spring_mybatis.relationmag.beans.HusBand;

public interface HusbandMapper {
	public int marry(@Param("hus")HusBand hus);	//男女结婚
	public HusBand getHusbandWithWifeByHusbandId(int id);
	public int deleteHusbandWithWifeByHusbandId(int id);
}
