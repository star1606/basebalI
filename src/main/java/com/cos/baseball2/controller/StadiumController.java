package com.cos.baseball2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.baseball2.model.Stadium;
import com.cos.baseball2.repository.StadiumRepository;

@Controller
public class StadiumController {
	
	
	@Autowired
	StadiumRepository stadiumRepository;
	
	
	@GetMapping("/")
	public @ResponseBody String index() {
			return "ㅇㅇ";
		}
	
	
//	@GetMapping({"/", ""})
//	public String index() {
//		return "stadiumList";
//	}
	
	@GetMapping("/stadium")
	public String stadium(Model model) {
		return "stadiumList";
	}
	
	@GetMapping("/stadiumRegister")
	public String stadiumRegister() {
		return "stadium/stadiumRegisterForm";
	}
	
	@PostMapping("/stadium") 
	public @ResponseBody String register(Stadium stadium) {
		
	stadiumRepository.register(stadium);
	System.out.println("post: register: " + stadium);
		return "성공";
	}
	
}
