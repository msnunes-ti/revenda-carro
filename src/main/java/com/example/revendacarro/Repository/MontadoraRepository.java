package com.example.revendacarro.Repository;

import com.example.revendacarro.model.Montadora;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MontadoraRepository extends JpaRepository<Montadora, Long> {

    List<Montadora> findByNome(String nome);

    Long countByNome(String nome);
}
