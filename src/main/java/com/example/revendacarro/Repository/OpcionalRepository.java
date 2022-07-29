package com.example.revendacarro.Repository;

import com.example.revendacarro.model.Opcional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OpcionalRepository extends JpaRepository<Opcional, Long> {

    List<Opcional> findByNomeContains(String nome);
}
