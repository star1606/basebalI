package com.cos.baseball2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.baseball2.model.Stadium;
import com.cos.baseball2.model.Team;
import com.cos.baseball2.repository.StadiumRepository;
import com.cos.baseball2.repository.TeamRepository;


import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
public class TeamController {
	
	@Autowired
	 TeamRepository teamRepository;
	
	@Autowired
	 StadiumRepository stadiumRepository;

	@GetMapping("/team")
	public String team(Model model) {
		model.addAttribute("teams", teamRepository.findAllJoin());
		return "team/team";
	}
	
	@GetMapping("/teamSaveForm")
	public String teamSave(Model model) {
		model.addAttribute("stadiums", stadiumRepository.findAll());
		return "team/teamSaveForm";
	}
	
	
	@PostMapping("/team")
	public @ResponseBody String stadiumSaveProc(Team team) {

		teamRepository.save(team);
		return "완료";
	}
	
	
	@DeleteMapping("/team")
	public @ResponseBody String stadiumDeleteProc(int id) {
	
		teamRepository.deleteById(id);
		return "완료";
	}
	
}