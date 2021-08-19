package br.lipsoft.cityapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor @AllArgsConstructor @Data
@Entity(name = "Country")
@Table(name = "Pais")
public class Country {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "nome_pt")
    private String namePt;

    @Column(name = "sigla")
    private String code;

    private Integer bacen;
}
