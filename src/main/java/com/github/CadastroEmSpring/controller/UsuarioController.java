package com.github.CadastroEmSpring.controller;

import com.github.CadastroEmSpring.model.UsuarioModel;
import com.github.CadastroEmSpring.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/home")
    public String homepage() {
        return "Seja bem vindo";
    }

    @PostMapping("/adicionarusuario")
    public String adicionarUsuario() {
        return "Usuario Adicionado";
    }

    @GetMapping("/todos")
    public List<UsuarioModel> listarUsuarios() {
        return usuarioService.listarUser();
    }
    //REVER ESSE CONTROLLER
    @GetMapping("/listar/{id}")
    public ResponseEntity<UsuarioModel> listarUsuariosPorId(@PathVariable Long id) {
        return usuarioService.listarUserPorId(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }


    @PutMapping("/alterar")
    public String alterarUsuario() {
        return "Usuario Alterado";
    }

    @DeleteMapping("/DeletarID")
    public String deletarUsuarioPorId() {
        return "Usuario Deletado";
    }
}
//Create
//Read
//update
//Delete