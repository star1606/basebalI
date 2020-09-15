package com.cos.baseball2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class KickedPlayer {
	
	private	int id;
	private	int playerId;
	private	String reason;
}
