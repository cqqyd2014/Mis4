package com.cqqyd2014.mis4.controller;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Root {
	
	@RequestMapping("/")
	public String root(Model model) {

				
		model.addAttribute("message", "¹þ·¢»õ");
		model.addAttribute("now", new java.util.Date());
		return "loginPage";
	}

}
