package com.algaworks.algatransito.domain.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.OffsetDateTime;


@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Autuacao {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Veiculo veiculo;


    private String descricao;
    private BigDecimal valorMulta;
    private OffsetDateTime dataOcorrencia;

    public Autuacao(){

    }

    public Autuacao(Long id, Veiculo veiculo, String descricao, BigDecimal valorMulta, OffsetDateTime dataOcorrencia) {
        this.id = id;
        this.veiculo = veiculo;
        this.descricao = descricao;
        this.valorMulta = valorMulta;
        this.dataOcorrencia = dataOcorrencia;
    }
}
