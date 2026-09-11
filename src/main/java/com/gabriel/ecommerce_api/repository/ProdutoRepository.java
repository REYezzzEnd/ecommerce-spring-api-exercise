package com.gabriel.ecommerce_api.repository;

import com.gabriel.ecommerce_api.entities.Categoria;
import com.gabriel.ecommerce_api.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Long> {

    List<Produto> findByCategoria(Categoria categoria);

    List<Produto> findByNomeContainingIgnoreCase(String nome);

    List<Produto> findByPrecoGreaterThanEqual(Double preco);

    List<Produto> findByPrecoBetween(Double minimo, Double maximo);

    List<Produto> findByItensPedidoPedidoClienteId(long id);
}
