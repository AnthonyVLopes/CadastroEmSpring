package com.github.CadastroEmSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.github.CadastroEmSpring.model.carroModel;
public interface carroRepository extends JpaRepository<carroModel,Long> {
}
