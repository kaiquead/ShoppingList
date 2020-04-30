package com.listaDeCompras.apiRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.listaDeCompras.apiRest.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	Produto findById (long id);
	Produto deleteById(long id);
}
