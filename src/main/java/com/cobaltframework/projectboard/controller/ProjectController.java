package com.cobaltframework.projectboard.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cobaltframework.projectboard.domain.Project;

@RestController
@RequestMapping("/api/project")
public class ProjectController {

	
	@PostMapping("")
	public ResponseEntity<Project> createNewProject(@RequestBody Project project) {
		
		return new ResponseEntity<Project>(project, HttpStatus.CREATED);
	}
}
