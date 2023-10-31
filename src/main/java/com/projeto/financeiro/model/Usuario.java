package com.projeto.financeiro.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Getter
@Setter
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 3, max = 55)
    @NotBlank
    private String nome;

    @NotBlank
    private String email;

    @NotBlank
    private String enderecoLogradouro;

    @NotBlank
    private String enderecoNumero;

    @NotBlank
    private String enderecoBairro;

    @NotBlank
    @Size(min = 2, max = 2)
    private String UF;

    @Min(11)@Max(11)
    private int CPF;
}
