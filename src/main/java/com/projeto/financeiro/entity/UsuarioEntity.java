package com.projeto.financeiro.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "T_USUARIO")
public class UsuarioEntity implements Serializable {
    @Id
    @Column(name = "USUARIO_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "USUARIO_NOME")
    private String nome;

    @Column(name = "USUARIO_EMAIL")
    private String email;

    @Column(name = "USUARIO_CPF")
    private int CPF;
}
