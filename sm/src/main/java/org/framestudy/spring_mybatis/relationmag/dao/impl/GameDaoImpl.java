package org.framestudy.spring_mybatis.relationmag.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis.relationmag.beans.Game;
import org.framestudy.spring_mybatis.relationmag.dao.IGameDao;
import org.framestudy.spring_mybatis.relationmag.mapper.GameMapper;
import org.springframework.stereotype.Repository;

@Repository
public class GameDaoImpl implements IGameDao {
	
	@Resource
	private GameMapper gm;

	public Game findGamesWithPlayerByGameId(int id) {
		// TODO Auto-generated method stub
		return gm.findGamesWithPlayerByGameId(id);
	}
	public List<Game> findAllGames() {
		// TODO Auto-generated method stub
		return gm.findAllGames();
	}

}
