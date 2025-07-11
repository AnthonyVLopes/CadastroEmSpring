package com.github.CadastroEmSpring.dto;

import com.github.CadastroEmSpring.model.CarroModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {

    private Long id;
    private String nome;
    private String email;
    private int idade;
    private List<CarroModel> Carros;
    private String genero;

}
