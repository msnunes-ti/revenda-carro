package com.example.revendacarro.services;

import com.example.revendacarro.Repository.ProprietarioRepository;
import com.example.revendacarro.dto.AtualizaProprietarioDTO;
import com.example.revendacarro.dto.CadastraProprietarioDTO;
import com.example.revendacarro.dto.ProprietarioDTO;
import com.example.revendacarro.mapper.AtualizaProprietarioDTOMapper;
import com.example.revendacarro.mapper.CadastraProprietarioDTOMapper;
import com.example.revendacarro.mapper.ProprietarioMapper;
import com.example.revendacarro.model.Proprietario;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProprietarioService {

    private final ProprietarioRepository proprietarioRepository;

    private Proprietario buscarProprietarioPorId(Long id) {
        return proprietarioRepository.findById(id).orElseThrow(() -> new RuntimeException("ID do Proprietário não encontrado."));
    }

    public List<ProprietarioDTO> buscarTodos(String cpfCnpj) {
        if (cpfCnpj == null) {
            List<Proprietario> proprietarioList = proprietarioRepository.findAll();
            return ProprietarioMapper.toProprietarioDTOList(proprietarioList);
        }
        List<Proprietario> proprietarioList = proprietarioRepository.findByCpfCnpj(cpfCnpj);
        return ProprietarioMapper.toProprietarioDTOList(proprietarioList);
    }

    public ProprietarioDTO buscarPorId(Long id) {
        return ProprietarioMapper.toProprietarioDTO(buscarProprietarioPorId(id));
    }

    public void cadastraProprietario(CadastraProprietarioDTO cadastraProprietarioDTO) {
        long proprietarioEncontrado = proprietarioRepository.countByCpfCnpj(cadastraProprietarioDTO.getCpfCnpj());
        if (proprietarioEncontrado > 0) {
            throw new RuntimeException("Esse CPF ou CNPJ já está cadastrado.");
        }
        proprietarioRepository.save(CadastraProprietarioDTOMapper.toProprietario(cadastraProprietarioDTO));
    }

    public void atualizaProprietario(Long id, AtualizaProprietarioDTO atualizaProprietarioDTO) {
        Proprietario proprietario;
        proprietario = AtualizaProprietarioDTOMapper.toProprietario(atualizaProprietarioDTO);
        proprietario.setId(buscarProprietarioPorId(id).getId());
        proprietarioRepository.save(proprietario);
    }

    public void deletarProprietario(Long id) {
        Proprietario proprietario = buscarProprietarioPorId(id);
        proprietarioRepository.delete(proprietario);
    }

}
