package com.example.revendacarro.Repository;

import com.example.revendacarro.model.Montadora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MontadoraRepository extends JpaRepository<Montadora, Long> {

    List<Montadora> findByNome(String nome);

    Long countByNome(String nome);
}
