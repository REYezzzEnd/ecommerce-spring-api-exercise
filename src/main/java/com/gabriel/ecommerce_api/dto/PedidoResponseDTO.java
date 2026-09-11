package com.gabriel.ecommerce_api.dto;

import com.gabriel.ecommerce_api.entities.ItemPedido;
import com.gabriel.ecommerce_api.entities.Pedido;
import com.gabriel.ecommerce_api.enums.StatusPedido;

import java.time.LocalDateTime;
import java.util.List;

public record PedidoResponseDTO(
            Long id,
            StatusPedido status,
            LocalDateTime ultimaAlteracao,
            LocalDateTime criado,
            ClienteResponseDTO cliente,
            List<ItemPedidoResponseDTO> itens
        ) {

    public PedidoResponseDTO(Pedido pedido){
        this(
                pedido.getId(),
                pedido.getStatus(),
                pedido.getUltimaAlteracao(),
                pedido.getCriacaoPedido(),
                new ClienteResponseDTO(pedido.getCliente()),
                pedido.getItemPedidos()
                        .stream()
                        .map(ItemPedidoResponseDTO::new)
                        .toList()
        );
    }

}
