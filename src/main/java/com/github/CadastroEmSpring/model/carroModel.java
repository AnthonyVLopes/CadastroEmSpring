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
public class carroModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carro")
    private Long id;
    private String modelo;
    private String ano;
    @Column(unique = true)
    private String placa;
    private String categoria;


    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private usuarioModel clientes;

}
