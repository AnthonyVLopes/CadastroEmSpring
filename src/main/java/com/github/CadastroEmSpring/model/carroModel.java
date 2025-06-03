package com.github.CadastroEmSpring.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name = "tb_carros")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class carroModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String modelo;
    private String ano;
    private String categoria;

    //Um Veiculo só pode ter um unico cliente
    @OneToMany(mappedBy = "Clientes")
    private usuarioModel clientes;

}
