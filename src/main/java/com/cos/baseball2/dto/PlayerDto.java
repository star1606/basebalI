package com.cos.baseball2.dto;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlayerDto {
	private int id;
	private String teamName;
	private String position;
	private String playerName;
	private int no;
}