package org.framestudy.spring_mybatis.relationmag.service;

import org.framestudy.spring_mybatis.relationmag.beans.Classes;

public interface IClassService {
	public Classes getClassesWithStusByClassId(int id);
}
