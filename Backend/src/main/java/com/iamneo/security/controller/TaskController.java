package com.iamneo.security.controller;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.iamneo.security.entity.Task;
import com.iamneo.security.service.TaskService;

import lombok.RequiredArgsConstructor;
@CrossOrigin(origins="*")
@RestController
@RequiredArgsConstructor
public class TaskController {
     private final TaskService stuService;
	
	@PostMapping("/post")
	
	public Task addInfo(@RequestBody Task st) {
		return stuService.saveDetails(st);
	}
	@GetMapping("/get")
	public List<Task>fetchDetails()
	{
		return stuService.getDetails();
	}
	@PutMapping("/put")
	public Task updateInfo(@RequestBody Task st1)
	{
		return stuService.updateDetails(st1);
	}
	@DeleteMapping("/delete/{taskid}")
	public String deleteInfo(@PathVariable("taskid")int taskid)
	{
		stuService.deleteDetails(taskid);
		return "Details Deleted";
	}
	

}