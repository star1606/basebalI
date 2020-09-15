package com.cos.baseball2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.baseball2.model.Player;
import com.cos.baseball2.repository.PlayerRepository;
import com.cos.baseball2.repository.TeamRepository;

@Controller
public class PlayerController {
	
	@Autowired
	private TeamRepository teamRepository;
	
	@Autowired
	private PlayerRepository playerRepository;

	
	@GetMapping("/playerSaveForm")
	public String playerSave(Model model) {
		
		model.addAttribute("teams", teamRepository.findAll());
		return "player/playerSaveForm";
	}
	
	
	@PostMapping("/player")
	public @ResponseBody String playerSaveProc(Player player) {
	
		playerRepository.save(player);
		return "완료";
	}
	
	
	
	@DeleteMapping("/player")
	public @ResponseBody String playerDeleteProc(int id) {
	
		playerRepository.deleteById(id);
		return "완료";
	}
}