package com.cos.baseball2.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class KickedPlayerDto {

	private int id;
	private int no;
	private String teamName;
	private String playerName;
	private String position;
	private String reason;
	
	
}
