package com.terminal.tms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.terminal.tms.model.Tms;
import com.terminal.tms.repository.TmsRepository;

@RestController
@RequestMapping("/")
public class TmsController {
	@Autowired
	private TmsRepository tmsRepository;
	
	@RequestMapping("/")
	public List<Tms> getAllTms(){
		return tmsRepository.findAll();
	}
	
	@RequestMapping("/{id}")
	
}
