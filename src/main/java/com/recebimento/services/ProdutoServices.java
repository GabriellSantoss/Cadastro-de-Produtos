package com.recebimento.services;


import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recebimento.data.vo.v1.ProdutoVO;
import com.recebimento.model.Produto;
import com.recebimento.repository.ProdutoRepository;






@Service
public class ProdutoServices {
	
	@Autowired
    private ProdutoRepository repository;
	
	
	 public ProdutoVO findById(Long id) {
	        Optional<Produto> person = repository.findById(id);
	        if (person.isPresent()) {
	            return convertToPersonVO(person.get());  // Converte a entidade para VO
	        } else {
	            return null;  // Ou lance uma exceção customizada
	        }
	    }
	 private ProdutoVO convertToPersonVO(Produto produto) {
	        ProdutoVO vo = new ProdutoVO();
	        vo.setId(produto.getId());
	        vo.setNome(produto.getNome());
	        vo.setQuantidade(produto.getQuantidade());
	        return vo;
	    }
}
