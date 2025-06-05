package com.github.CadastroEmSpring.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_carros")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CarroModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carro")
    private Long id;
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "ano_fabricacao")
    private String ano;
    @Column(unique = true, name = "placa")
    private String placa;
    private String categoria;


    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private UsuarioModel cliente;

}
