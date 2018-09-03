package com.terminal.tms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@RequestMapping("/addtms/{id}")
	public Tms addTms (Tms tms) {
		return tmsRepository.save(tms);
	}
	
	@RequestMapping("/showtms/{id}")
	public String showTms(@PathVariable String id, Model model) {
		return "";
	}
	
	@RequestMapping("/updatetms/{id}")
	public String updateTms() {
		return "";
	}
	
	@RequestMapping("/deletetms/{id}")
	public String deleteTms(@RequestBody String id) {
		return "";
	}

}
