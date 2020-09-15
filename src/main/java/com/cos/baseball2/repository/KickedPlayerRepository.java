package com.cos.baseball2.repository;

import java.util.List;

import com.cos.baseball2.dto.KickedPlayerDto;
import com.cos.baseball2.model.KickedPlayer;

public interface KickedPlayerRepository {
	
	public List<KickedPlayerDto> findAll(int teamId);
	public void save(KickedPlayer kickedPlayer );
}
