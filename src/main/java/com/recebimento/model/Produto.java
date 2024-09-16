package com.recebimento.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "nome", nullable = false, length = 80)
	private String nome;
	@Column(name = "quantidade", nullable = false)
	private int quantidade;
	@Column(name = "data_validade", nullable = false)
	private LocalDate dataValidade;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public LocalDate getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
	}
	public Produto() {
		
	}
	
	
	

}
