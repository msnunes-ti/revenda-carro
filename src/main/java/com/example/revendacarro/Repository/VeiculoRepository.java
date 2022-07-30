package com.example.revendacarro.Repository;

import com.example.revendacarro.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

    Veiculo findByPlaca(String placa);

}
