package br.edu.universidadedevassouras.prova.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPessoa;

    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String email;
    @Column(nullable = true)
    private Date nascimento;
    @Column(nullable = false)
    private String sexo;
    @Column(nullable = false)
    private String cpf;
    @Column(nullable = false)
    private String rg;
    @Column(nullable = false)
    private String ts;
    @Column(nullable = false)
    private String pai;
    @Column(nullable = false)
    private String mae;


}