package org.framestudy.spring_mybatis.relationmag.mapper;

import java.util.List;

import org.framestudy.spring_mybatis.relationmag.beans.Game;

public interface GameMapper {
	public List<Game> findAllGames();	//查询所有的游戏
	
	public Game findGamesWithPlayerByGameId(int id);
}
