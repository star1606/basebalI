package com.cos.baseball2.repository;

import java.util.List;

import com.cos.baseball2.model.Stadium;

public interface StadiumRepository {
	
	public void register(Stadium stadium);
	public List<Stadium> findAll();
	public void deleteById(int id);
}
