package com.gabriel.ecommerce_api.repository;

import com.gabriel.ecommerce_api.entities.Categoria;
import com.gabriel.ecommerce_api.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
    List<Categoria> findByNomeContainingIgnoreCase(String nome);
}
