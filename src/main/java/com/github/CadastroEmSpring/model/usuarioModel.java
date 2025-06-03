package com.github.CadastroEmSpring.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_usuario")
public class usuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private int idade;
    //Um cliente pode ter varios veiculos alugados
    @ManyToOne
    @JoinColumn(name = "id_carroCliente") // Representação de uma PK por assim dizer
    private List<carroModel> carros;

    public usuarioModel() {
    }

    public usuarioModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
