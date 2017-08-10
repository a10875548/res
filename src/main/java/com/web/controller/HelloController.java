package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * 
 * @author Aiden
 * @version 1.0.0 2017年8月8日 下午5:32:33
 */
@Controller
@RequestMapping("/test")
public class HelloController {
	
	@RequestMapping("/hello")
	public @ResponseBody String hello(){
		return "hello world";
	}
	
	@RequestMapping("/test1")
	public ModelAndView test1(){
		ModelAndView mv = new ModelAndView("/index.jsp");
		return mv;
	}
}
