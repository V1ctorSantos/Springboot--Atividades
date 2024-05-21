package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola-mundo")
public class HelloWorldController {
	
	@GetMapping
	public String ola() {
		return "Olá mundo! Bom dia!";
	}
	@GetMapping("comidas")
	public String comidasFavoritas() {
		return "sushi \nHamburguer";
	}
	@GetMapping("livros")
	public String livrosFavoritos() {
		return "Eragon \nSenhor dos Aneis";
	}
	
	@GetMapping("BSMs") 
		public String bsmgen() {
		return "Persistência \nOrientação ao Detalhe \nOrientação ao Futuro \nResponsabilidade Pessoal \nTrabalho em Equipe";
	}
	
	@GetMapping("Aprendizagem")
	public String weeklearn() {
		return "Comunicação \nOrientação ao Detalhe \nGestão de Tempo \nDisciplina";
	}

}
