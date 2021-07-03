package com.example.demo;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller {
	@Autowired 
	UuidRepo repo;
	
	@RequestMapping("/")
	public String generate() {
		return "generate";
	}
	
//	@RequestMapping("/list")
//	@ResponseBody
//	public ModelAndView lists(@RequestParam UUID uuid) {
//		ModelAndView mv = new ModelAndView("lists");
//		repo.findAll().toString();
//		return mv;
//	}
//	@RequestMapping("lists")
//	public String lists(UUIDClass uuid) {
//		uuid = new UUIDClass();
//		repo.save(uuid);
//	}
	
	@RequestMapping("list")
	@ResponseBody
	public String list(UUIDClass uuid) {
		uuid = new UUIDClass();
		repo.save(uuid);
		return repo.findAll().toString();
	}

}
