package com.github.CadastroEmSpring.controller;

import com.github.CadastroEmSpring.model.CarroModel;
import com.github.CadastroEmSpring.service.CarroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculo")
public class CarroController {

    private CarroService carroService;

    public CarroController(CarroService carroService) {
        this.carroService = carroService;
    }

    @GetMapping("/todos")
    public List<CarroModel> listarTodosOsVeiculos() {
        return carroService.listarVeiculo();
    }

    @PostMapping("/criar")
    public CarroModel criarVeiculo(CarroModel carroModel) {
        return carroService.criarveiculo(carroModel);
    }

    @DeleteMapping("/deletar/{id}")
    public String deletarPorId(@PathVariable Long id) {
        carroService.deletarPorId(id);
        return "Veiculo deletado";
    }

    @PutMapping("/alterar/{id}")
    public CarroModel alterar(@PathVariable Long id, @RequestBody CarroModel carroAtualizado) {
        return carroService.alterarPorId(id, carroAtualizado);
    }

}
