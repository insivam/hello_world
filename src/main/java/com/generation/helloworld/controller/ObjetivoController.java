package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivo")
public class ObjetivoController {
	
	@GetMapping
	public String objetivo(){
		return "Meu objetivo principal é me desenvolver melhor melhor em Spring e aprender sobre as novas tecnologias sendo apresentadas durante a Generation.";
	}
}
