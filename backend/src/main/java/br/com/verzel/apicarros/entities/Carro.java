package br.com.verzel.apicarros.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    @NotEmpty(message = "{campo.nome.obrigatorio}")
    private String nome;

    @Column(nullable = false, length = 50)
    @NotEmpty(message = "{campo.marca.obrigatorio}")
    private String marca;

    @Column(nullable = false, length = 30)
    @NotEmpty(message = "{campo.modelo.obrigatorio}")
    private String modelo;

    @Column(nullable = false)
    @NotNull(message = "{campo.valor.obrigatorio}")
    private Double valor;

}
