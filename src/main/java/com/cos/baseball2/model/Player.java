package com.cos.baseball2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Player {
	
	private int id;
	private String name;
	private int TeamId;
	private String position;
}
