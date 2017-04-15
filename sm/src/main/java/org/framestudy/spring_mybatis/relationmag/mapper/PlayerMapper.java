package org.framestudy.spring_mybatis.relationmag.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.framestudy.spring_mybatis.relationmag.beans.Game;
import org.framestudy.spring_mybatis.relationmag.beans.Player;

public interface PlayerMapper {
	public Player findPlayerById(int id);	//根据ID查询玩家
	public int playerChoiceGames(@Param("player")Player player, @Param("games")List<Game> games);	//玩家选择多个游戏
	
	public List<Player> getPlayerWithGamesByPlayerName(@Param("name")String name);
	
	public Player findPlayerWithGamesByPlayerId(int id);
}
