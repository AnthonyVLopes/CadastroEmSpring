package com.github.CadastroEmSpring.mapper;

import com.github.CadastroEmSpring.dto.UsuarioDTO;
import com.github.CadastroEmSpring.model.UsuarioModel;
import org.springframework.stereotype.Component;

@Component
public class UsuarioMapper {

    public UsuarioModel mapModel(UsuarioDTO usuarioDTO) {
        UsuarioModel usuarioModel = new UsuarioModel();
        usuarioModel.setId(usuarioDTO.getId());
        usuarioModel.setNome(usuarioDTO.getNome());
        usuarioModel.setEmail(usuarioDTO.getEmail());
        usuarioModel.setIdade(usuarioDTO.getIdade());
        usuarioModel.setCarros(usuarioDTO.getCarros());
        usuarioModel.setGenero(usuarioDTO.getGenero());

        return usuarioModel;
    }

    public UsuarioDTO mapDTO(UsuarioModel usuarioModel) {
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setId(usuarioModel.getId());
        usuarioDTO.setNome(usuarioModel.getNome());
        usuarioDTO.setEmail(usuarioDTO.getEmail());
        usuarioDTO.setIdade(usuarioDTO.getIdade());
        usuarioDTO.setCarros(usuarioModel.getCarros());
        usuarioDTO.setGenero(usuarioModel.getGenero());

        return usuarioDTO;
    }


}
