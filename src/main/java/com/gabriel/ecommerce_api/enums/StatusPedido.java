package com.gabriel.ecommerce_api.enums;

import lombok.Getter;

@Getter
public enum StatusPedido {
    AGUARDANDO("aguardando efetuar pagamento"),
    PAGO("pedido ja foi pago"),
    ENVIADO("pedido esta sendo enviado"),
    ENTREGUE("pedido ja foi entregue");

    private final String status;

    StatusPedido(String status) {
        this.status = status;
    }
}
