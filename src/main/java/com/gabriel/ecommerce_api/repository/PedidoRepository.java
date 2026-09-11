package com.gabriel.ecommerce_api.repository;

import com.gabriel.ecommerce_api.entities.Cliente;
import com.gabriel.ecommerce_api.entities.Pedido;
import com.gabriel.ecommerce_api.entities.Produto;
import com.gabriel.ecommerce_api.enums.StatusPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido,Long> {
    List<Pedido> findByCliente(Cliente cliente);

    List<Pedido> findByStatus(StatusPedido status);

    List<Pedido> findByClienteNomeContainingIgnoreCase(String nome);

    List<Pedido> findByClienteId(Long id);

    List<Pedido> findByItemPedidosProduto(Produto produto);

    Long countByClienteId(Long id);
}
