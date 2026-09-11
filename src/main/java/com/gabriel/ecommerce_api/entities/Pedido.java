package com.gabriel.ecommerce_api.entities;

import com.gabriel.ecommerce_api.enums.StatusPedido;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "pedidos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotNull
    @Enumerated(EnumType.STRING)
    private StatusPedido status;

    @CreationTimestamp
    private LocalDateTime criacaoPedido;

    @UpdateTimestamp
    private LocalDateTime ultimaAlteracao;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    @NotNull
    @OneToMany(mappedBy = "pedido")
    private List<ItemPedido> itemPedidos;
}
