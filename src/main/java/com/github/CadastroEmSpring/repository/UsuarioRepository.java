package com.github.CadastroEmSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.github.CadastroEmSpring.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel,Long> {
}
