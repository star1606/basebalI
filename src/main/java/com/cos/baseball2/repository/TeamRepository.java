package com.cos.baseball2.repository;

import java.util.List;

import com.cos.baseball2.model.Team;

public interface TeamRepository {
	
	public void save(Team team);
	public List<Team> findAllJoin();
	public List<Team> findAll();
	public void deleteById(int id);
	
}
