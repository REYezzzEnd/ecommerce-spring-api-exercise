package com.gabriel.ecommerce_api.dto;

import com.gabriel.ecommerce_api.entities.Categoria;

public record CategoriaDTO(
        Long id,
        String nome
) {
    public CategoriaDTO(Categoria categoria){
        this(
                categoria.getId(),
                categoria.getNome()
        );
    }
}
