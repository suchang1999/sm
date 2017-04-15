package org.framestudy.spring_mybatis.relationmag.service;

import org.framestudy.spring_mybatis.relationmag.beans.Students;

public interface IStudentService {
	public Students getStudentWithClassByStudentId(int id);
}
