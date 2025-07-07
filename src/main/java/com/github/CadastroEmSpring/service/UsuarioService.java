package com.github.CadastroEmSpring.service;

import com.github.CadastroEmSpring.model.UsuarioModel;
import com.github.CadastroEmSpring.repository.UsuarioRepository;
import org.springframework.stereotype.Service;


import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<UsuarioModel> listarUser() {
        return usuarioRepository.findAll();
    }

    //REVER ESSE SERVICE
    public Optional<UsuarioModel> listarUserPorId(Long id) {
        return usuarioRepository.findById(id);
    }


    public UsuarioModel criarUsuario(UsuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }

    public void deletarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

    public UsuarioModel atualizarPorid(Long id, UsuarioModel usuarioAtualizado) {
        if (usuarioRepository.existsById(id)) {
            usuarioAtualizado.setId(id);
            return usuarioRepository.save(usuarioAtualizado);
        }
        return null;
    }
}


