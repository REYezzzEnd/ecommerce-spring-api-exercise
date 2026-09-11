package com.gabriel.ecommerce_api.repository;

import com.gabriel.ecommerce_api.entities.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {

    List<ItemPedido> findByPrecoBetween(Double minimo, Double maximo);

    List<ItemPedido> findByPrecoGreaterThanEqual(Double preco);

    List<ItemPedido> findByPrecoLessThanEqual(Double preco);

    List<ItemPedido> findByQuantidadeGreaterThanEqual(Integer quantidade);

    List<ItemPedido> findByQuantidadeLessThanEqual(Integer quantidade);

}
