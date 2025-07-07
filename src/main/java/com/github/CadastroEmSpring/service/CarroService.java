package com.github.CadastroEmSpring.service;

import com.github.CadastroEmSpring.model.CarroModel;
import com.github.CadastroEmSpring.model.UsuarioModel;
import com.github.CadastroEmSpring.repository.CarroRepository;


import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CarroService {

    private CarroRepository carroRepository;

    public CarroService(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    public List<CarroModel> listarVeiculo() {
        return carroRepository.findAll();
    }

    public CarroModel criarveiculo(CarroModel veiculo) {
        return carroRepository.save(veiculo);
    }

    public void deletarPorId(Long id) {
        carroRepository.deleteById(id);
    }

    public CarroModel alterarPorId(Long id, CarroModel carroParaAlterar) {
        if (carroRepository.existsById(id)) {
            carroParaAlterar.setId(id);
            return carroRepository.save(carroParaAlterar);
        }
        return null;

    }


}
