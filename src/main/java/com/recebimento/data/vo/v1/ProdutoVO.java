package com.recebimento.data.vo.v1;

import java.io.Serializable;
import java.util.Objects;

public class ProdutoVO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long id;
	private String nome;
	private int quantidade;
	private int dataValidade;
	
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
	public int getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(int dataValidade) {
		this.dataValidade = dataValidade;
	}
	public ProdutoVO() {
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(dataValidade, id, nome, quantidade);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoVO other = (ProdutoVO) obj;
		return dataValidade == other.dataValidade && id == other.id && Objects.equals(nome, other.nome)
				&& quantidade == other.quantidade;
	}

	
}
