package com.gabriel.ecommerce_api.dto;

import com.gabriel.ecommerce_api.entities.Categoria;
import com.gabriel.ecommerce_api.entities.Produto;

import java.time.LocalDateTime;

public record ProdutoResponseDTO(
        Long id,
        String nome,
        Double preco,
        CategoriaDTO categoria,
        LocalDateTime ultimaAlteracao
) {
    public ProdutoResponseDTO(Produto produto){
        this(
                produto.getId(),
                produto.getNome(),
                produto.getPreco(),
                new CategoriaDTO(produto.getCategoria()),
                produto.getUltimaAlteracao()
        );
    }
}
