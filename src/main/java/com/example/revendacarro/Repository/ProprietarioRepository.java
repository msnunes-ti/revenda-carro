package com.example.revendacarro.Repository;

import com.example.revendacarro.model.Proprietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProprietarioRepository extends JpaRepository<Proprietario, Long> {

    List<Proprietario> findByCpfCnpj(String cpfCnpj);

    long countByCpfCnpj(String cpfCnpj);
}
