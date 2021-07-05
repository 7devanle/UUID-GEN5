package com.example.demo;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller {
	@Autowired 
	UuidRepo repo;
	
//	@RequestMapping("/")
//	public String generate() {
//		return "generate";
//	}
	
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
	
	@RequestMapping("")
	@ResponseBody
	public List<UUIDClass> list(UUIDClass uuid) {
		uuid = new UUIDClass();
		repo.save(uuid);
		return repo.findAll();
	}
	
	@RequestMapping("uuids")
	@ResponseBody
	public List<UUIDClass> listOfUuids() {
		return repo.findAll();
	}
	
	@RequestMapping("uuids/{uuid}")
	@ResponseBody
	public Optional<UUIDClass> listOfUuids(@PathVariable("uuid") UUID uuid) {
		return repo.findById(uuid);
	}
	
	@PostMapping("/createuuid")
	public UUIDClass creatUuid(@RequestBody UUIDClass uuid) {
		repo.save(uuid);
		return uuid;
	}
	
	@DeleteMapping("/deleteuuid/{uuid}")
	public UUIDClass deleteuuid(@PathVariable("uuid") UUID uuid) {
		UUIDClass uuuid = repo.getById(uuid);
		repo.delete(uuuid);
		return uuuid;
	}
	
	@PutMapping(path= "/updateuuid", consumes= {"application/json"})
	public UUIDClass updateuuid(@RequestBody UUIDClass uuid) {
		repo.save(uuid);
		return uuid;
	}
	
	
	
	
}
