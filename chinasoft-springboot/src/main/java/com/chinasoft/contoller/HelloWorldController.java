package com.chinasoft.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class HelloWorldController {
	
	@RequestMapping("/info")
	@ResponseBody
	public String info(){
		return "Hello World!!!";
		
	}
	
}
