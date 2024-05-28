package com.example.Result.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Result.model.Register;
import com.example.Result.repoaitory.RegisterRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/result/")
public class RegisterController {
  @Autowired
  @Qualifier("regRepo")
  RegisterRepository regRepo;
@GetMapping("/register")
public String register()
{
	return "Register page";
}
@PostMapping("/register")
public Register handlepost(@RequestBody Register r)
{
	return regRepo.save(r);
	
}
@GetMapping("/register/{emailid}/{password}")
public Register login(@PathVariable("emailid") String emailid, @PathVariable("password") String Password)
{
	return regRepo.findbyEmailIDAndPassword(emailid, Password);
}
}
