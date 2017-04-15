package org.framestudy.spring_mybatis.relationmag.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis.relationmag.beans.Game;
import org.framestudy.spring_mybatis.relationmag.beans.Player;
import org.framestudy.spring_mybatis.relationmag.dao.IPlayerDao;
import org.framestudy.spring_mybatis.relationmag.service.IPlayerService;
import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImpl implements IPlayerService {
	
	@Resource
	private IPlayerDao playerDaoImpl;
	
	public Player findPlayerById(int id) {
		// TODO Auto-generated method stub
		return playerDaoImpl.findPlayerById(id);
	}

	public int playerChoiceGames(Player player, List<Game> games) {
		// TODO Auto-generated method stub
		return playerDaoImpl.playerChoiceGames(player, games);
	}

	public List<Player> getPlayerWithGamesByPlayerName(String name) {
		// TODO Auto-generated method stub
		return playerDaoImpl.getPlayerWithGamesByPlayerName(name);
	}

	public Player findPlayerWithGamesByPlayerId(int id) {
		// TODO Auto-generated method stub
		return playerDaoImpl.findPlayerWithGamesByPlayerId(id);
	}

}
