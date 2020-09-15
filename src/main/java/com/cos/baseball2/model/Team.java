package com.cos.baseball2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Team {
	
	private int id;
	private int stadiumId;
	private String name;
}
