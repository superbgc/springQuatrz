package cn.gc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	@ResponseBody
	@RequestMapping("/login")
	public String hello(@RequestParam("username") String username,@RequestParam("password") String password){
		
		
		return "Hello"+username+",YOU de password is:"+password;
		
	}
}
