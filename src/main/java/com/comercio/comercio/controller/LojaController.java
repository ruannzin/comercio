package com.comercio.comercio.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.comercio.comercio.model.Produto;


@Controller
@RequestMapping("comercio/produtos")

public class LojaController {
	
	List<Produto> listaDeProdutos= new ArrayList<Produto>();
	
	@GetMapping("/listar")
	public String istarProdutos() {
		
		Produto p1 = new Produto();
		p1.setId(201);
		p1.setNome("Máquina de Lavar Brastemp 151");
		p1.setCodigoBarras("1453IFJFUDE212456");
		p1.setDescricao("Produto Linha Branca com painel digital");
		p1.setPreco(3215.89);
		
		Produto p2 = new Produto();
		p1.setId(201);
		p1.setNome("Televisor 70");
		p1.setCodigoBarras("1453IFJFUDE212456");
		p1.setDescricao("Televisor Tela Plana let Samsung");
		p1.setPreco(3215.89);
		
		// Adicionando os produtos à lista
		
		listaDeProdutos.add(p1);
		listaDeProdutos.add(p2);
		
		return "produtos";
	}

}
