package com.recebimento.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recebimento.data.vo.v1.ProdutoVO;

import com.recebimento.services.ProdutoServices;

@RestController
@RequestMapping("/Produtos")
public class ProdutosController {
	@Autowired
	ProdutoServices service;

	public ResponseEntity<ProdutoVO> findById(@PathVariable("id") Long id) {
		ProdutoVO person = service.findById(id);
		if (person != null) {
			return ResponseEntity.ok(person); // Retorna 200 OK com o objeto
		} else {
			return ResponseEntity.notFound().build(); // Retorna 404 se não encontrar
		}
	}

}
