package com.cos.baseball2.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeamDto {
	private int id;
	private String stadiumName;
	private String teamName;
	private int no;
}