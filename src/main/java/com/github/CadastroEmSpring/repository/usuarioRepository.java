package com.github.CadastroEmSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.github.CadastroEmSpring.model.usuarioModel;

public interface usuarioRepository extends JpaRepository<usuarioModel,Long> {
}
