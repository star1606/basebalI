package com.cos.baseball2.repository;

import java.util.List;

import com.cos.baseball2.dto.PlayerDto;
import com.cos.baseball2.model.Player;

public interface PlayerRepository {
	
	public void save(Player player);
	public List<Player> findAll();
	public List<PlayerDto> findAllJoin();
	public void deleteById(int id);
	
	
}
