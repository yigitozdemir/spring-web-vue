package com.yigitozdemir.SpringWebVue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@RequestMapping("/")
	@ResponseBody
	public String index(Model model) {
		return "hello from my world";
	}
	
	@RequestMapping("/view")
	public String view() {
		return "index";
	}
	
	@RequestMapping("/view2")
	public String view2() {
		return "index2";
	}
}
