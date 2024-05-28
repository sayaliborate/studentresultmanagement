package com.example.Result.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Result.model.Feedback;
import com.example.Result.repoaitory.FeedbackRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/result/")
public class FeedbackController {
	@Autowired
	@Qualifier("feedRepo")
	FeedbackRepository feedRepo;
	@GetMapping("/feedback")
	public String feedback()
	{
		return "Feedback page";
	}
	@PostMapping("/feedback")
	public Feedback savefeedback(@RequestBody Feedback f)
	{
		return  feedRepo.save(f);
	}
	

}
