package com.cos.baseball2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.baseball2.dto.KickedPlayerDto;
import com.cos.baseball2.dto.KickedPlayerRespDto;
import com.cos.baseball2.model.KickedPlayer;
import com.cos.baseball2.repository.KickedPlayerRepository;
import com.cos.baseball2.repository.PlayerRepository;
import com.cos.baseball2.repository.TeamRepository;

@Controller
public class KickedPlayerController {

	@Autowired
	KickedPlayerRepository kickedPlayerRepository;
	
	@Autowired
	PlayerRepository playerRepository;
	
	@Autowired
	TeamRepository teamRepository;
	
	@GetMapping("/kickedPlayer")
	public String kickedPlayer(Model model) {
		KickedPlayerDto respDto = KickedPlayerDto.builder()
				.Teams(teamRepository.findAll())
				.kickedPlayerDtos(kickedPlayerRepository.findAll(1))
				.build();
		
		model.addAttribute("respDto", respDto);
		return "kickedPlayer/kickedPlayer";
	}
	
	
	
	@GetMapping("/kickedPlayerSaveForm")
	public String kickedPlayerSave(Model model) {
		model.addAttribute("players", playerRepository.findAll());
		return "kickedPlayer/kickedPlayerSaveForm";
	}
	
	@PostMapping("/kickedPlayer")
	public String kickedPlayerSaveProc(KickedPlayer kickedPlayer) {
		kickedPlayerRepository.save(kickedPlayer);
		return "kickedPlayer/kickedPlayerSaveForm";
	}
}