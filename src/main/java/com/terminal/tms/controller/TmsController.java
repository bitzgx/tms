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
	
	@RequestMapping("/addtms")
	public Tms addTms (Tms tms) {
		return tmsRepository.save(tms);
	}
	
	@RequestMapping("/showtms/{id}")
	public TmsRepository showTms(@PathVariable Long id, Model model) {
		model.addAttribute("tms", tmsRepository.findById(id));
		return tmsRepository;
	}
	
	@RequestMapping("/updatetms/{id}")
	public TmsRepository updateTms(@PathVariable Long tmsId) {
		return tmsRepository;
	}
	
	@RequestMapping("/deletetms/{id}")
	public TmsRepository deleteTms(@RequestBody String id) {
		return tmsRepository;
	}

}
