package com.example.revendacarro.Repository;

import com.example.revendacarro.model.Opcional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OpcionalRepository extends JpaRepository<Opcional, Long> {

    List<Opcional> findByNomeContains(String nome);
}
