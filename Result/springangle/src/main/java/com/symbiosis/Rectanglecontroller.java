package com.symbiosis;

import org.springframework.web.bind.annotation.RequestMapping;

public class Rectanglecontroller {
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	@RequestMapping("/rect")
	public String rectarea()
	{
		return "rectform";
	}
	@RequestMapping("/calci")
	public String calculate()
}
