package com.gabriel.ecommerce_api.repository;

import com.gabriel.ecommerce_api.entities.Cliente;
import com.gabriel.ecommerce_api.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    List<Cliente> findByDataCriacaoAfter(LocalDateTime horario);

    List<Cliente> findByDataCriacaoBefore(LocalDateTime horario);

    List<Cliente> findByNomeIgnoreCase(String nome);

    List<Cliente> findByPedidosItemPedidosProduto(Produto produto);

    List<Cliente> findByEnderecoCep(String cep);

    List<Cliente> findByEnderecoRuaAndEnderecoBairro(String rua, String bairro);
}