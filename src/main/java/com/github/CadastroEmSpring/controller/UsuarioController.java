package com.github.CadastroEmSpring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class UsuarioController {

    @GetMapping("/home")
    public String homepage() {
        return "Seja bem vindo";
    }

    //Create
    @PostMapping("/adicionarusuario")
    public String adicionarUsuario() {
        return "Usuario Adicionado";
    }

    @GetMapping("/todos")
    public String listarUsuarios() {
        return "Todos os Usuarios Foram Retornados";
    }

    @GetMapping("/todosId")
    public String listarUsuariosId() {
        return "Todos os ID dos Usuarios Foram Retornados";
    }

    @PutMapping("/alterar")
    public String alterarUsuario() {
        return "Usuario Alterado";
    }
    @DeleteMapping("/DeletarID")
    public String deletarUsuarioPorId(){
        return "Usuario Deletado";
    }
}
//Create
//Read
//update
//Delete