package com.cos.baseball2.dto;

import java.util.List;

import com.cos.baseball2.model.Team;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class KickedPlayerRespDto {
	List<Team> Teams;
	List<KickedPlayerDto> KickedPlayerDtos;
}
