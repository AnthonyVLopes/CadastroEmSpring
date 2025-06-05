package com.github.CadastroEmSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.github.CadastroEmSpring.model.CarroModel;
public interface CarroRepository extends JpaRepository<CarroModel,Long> {
}
