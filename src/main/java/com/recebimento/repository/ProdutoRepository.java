package com.recebimento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recebimento.model.Produto;



public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
