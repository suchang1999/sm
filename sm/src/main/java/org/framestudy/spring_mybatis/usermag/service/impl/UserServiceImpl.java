package org.framestudy.spring_mybatis.usermag.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis.pojos.Pager;
import org.framestudy.spring_mybatis.usermag.beans.UserInfo;
import org.framestudy.spring_mybatis.usermag.dao.IUserDao;
import org.framestudy.spring_mybatis.usermag.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly=true)
@Service
public class UserServiceImpl implements IUserService {
	
	@Resource
	private IUserDao userDaoImpl;

	@Transactional(readOnly=false,isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public int saveUserInfo(UserInfo user) {
		// TODO Auto-generated method stub
		return userDaoImpl.saveUserInfo(user);
	}

	@Transactional(readOnly=false,isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public int updateUserInfo(UserInfo user) {
		// TODO Auto-generated method stub
		return userDaoImpl.updateUserInfo(user);
	}

	@Transactional(readOnly=false,isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public int deleteUserInfo(int id) {
		// TODO Auto-generated method stub
		return userDaoImpl.deleteUserInfo(id);
	}

	@Transactional(readOnly=false,isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public UserInfo getUserInfoById(int id) {
		// TODO Auto-generated method stub
		return userDaoImpl.getUserInfoById(id);
	}

	@Transactional(readOnly=false,isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public UserInfo getUserByLoginNameAndPwd(String loginName, String pwd) {
		// TODO Auto-generated method stub
		return userDaoImpl.getUserByLoginNameAndPwd(loginName, pwd);
	}

	@Transactional(readOnly=false,isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public List<UserInfo> queryUserListByMap(Map map) {
		// TODO Auto-generated method stub
		return userDaoImpl.queryUserListByMap(map);
	}

	@Transactional(readOnly=false,isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public int batcheSaveUserInfo(List<UserInfo> users) {
		// TODO Auto-generated method stub
		return userDaoImpl.batcheSaveUserInfo(users);
	}

	@Transactional(readOnly=false,isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public int batchDeleteUserInfo(List<UserInfo> users) {
		// TODO Auto-generated method stub
		return userDaoImpl.batchDeleteUserInfo(users);
	}

	@Transactional(readOnly=false,isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public Pager getUserListByMapToPager(Map map) {

		int totalRows = userDaoImpl.countUserListByMapToPage(map);
		List<?> list = userDaoImpl.getUserListByMapToPage(map);
		
		return new Pager(totalRows,list);
	}

}
