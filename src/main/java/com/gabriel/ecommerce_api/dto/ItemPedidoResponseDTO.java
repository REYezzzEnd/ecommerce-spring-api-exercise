package com.gabriel.ecommerce_api.dto;

import com.gabriel.ecommerce_api.entities.ItemPedido;

public record ItemPedidoResponseDTO(
        Long id,
        Integer quantidade,
        Double preco,
        ProdutoResponseDTO produto
) {
    public ItemPedidoResponseDTO(ItemPedido itemPedido){
        this(
                itemPedido.getId(),
                itemPedido.getQuantidade(),
                itemPedido.getPreco(),
                new ProdutoResponseDTO(itemPedido.getProduto())
        );
    }
}
