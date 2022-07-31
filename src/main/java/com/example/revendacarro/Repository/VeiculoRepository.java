package com.example.revendacarro.Repository;

import com.example.revendacarro.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

    Veiculo findByPlaca(String placa);

    List<Veiculo> findByModeloContains(String modelo);
}
