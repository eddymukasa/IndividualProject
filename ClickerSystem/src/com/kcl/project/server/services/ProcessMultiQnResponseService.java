package com.kcl.project.server.services;

import com.kcl.project.shared.DTO.MultiQnDto;

public interface ProcessMultiQnResponseService {

	String getQuestion(MultiQnDto dto);
	
	String getAnswer(MultiQnDto dto);
}
