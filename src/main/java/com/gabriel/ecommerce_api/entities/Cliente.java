package com.gabriel.ecommerce_api.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "clientes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Não pode estar vazio!")
    @Column(nullable = false)
    private String nome;

    @NotNull(message = "Deve preencher o endereço")
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "rua", column = @Column(name = "rua_atual")),
            @AttributeOverride(name = "bairro", column = @Column(name = "bairro_atual")),
            @AttributeOverride(name = "cep", column = @Column(name = "cep_atual"))
    })
    private Endereco endereco;

    @OneToMany(mappedBy = "cliente")
    private List<Pedido> pedidos;

    @NotNull(message = "Deve ser preenchida a data de nascimento")
    @Column(nullable = false)
    private LocalDate dataNascimento;

    @CreationTimestamp
    private LocalDateTime dataCriacao;

    @UpdateTimestamp
    private LocalDateTime ultimaAlteracao;
}
