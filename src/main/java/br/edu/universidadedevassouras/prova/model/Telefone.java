package br.edu.universidadedevassouras.prova.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTelefone;

    @Column(nullable = false)
    private int telefone_celular;
    @Column(nullable = false)
    private int telefone_fixo;
    @OneToOne
    private Pessoa idPessoa;
}
