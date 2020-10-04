package com.upemor.sesioncuatro.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SaludoRest {
	
	@GetMapping("saludo")
	public String saludo() {
		return "Hola mundo desde mi aplicación";
	}
}