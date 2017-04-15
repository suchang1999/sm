package org.framestudy.spring_mybatis.relationmag.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis.relationmag.beans.Game;
import org.framestudy.spring_mybatis.relationmag.dao.IGameDao;
import org.framestudy.spring_mybatis.relationmag.service.IGameService;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl implements IGameService {
	
	@Resource
	private IGameDao gameDaoImpl;
	
	public List<Game> findAllGames() {
		// TODO Auto-generated method stub
		return gameDaoImpl.findAllGames();
	}

	public Game findGamesWithPlayerByGameId(int id) {
		// TODO Auto-generated method stub
		return gameDaoImpl.findGamesWithPlayerByGameId(id);
	}

}
