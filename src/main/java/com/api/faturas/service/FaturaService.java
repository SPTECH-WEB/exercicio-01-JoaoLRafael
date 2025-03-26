package com.api.faturas.service;

import com.api.faturas.model.Fatura;
import com.api.faturas.repository.FaturaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaturaService {
    private final FaturaRepository faturaRepository;

    public FaturaService(FaturaRepository faturaRepository) {
        this.faturaRepository = faturaRepository;
    }

    public List<Fatura> listarFaturas() {
        return faturaRepository.findAll();
    }

    public Fatura cadastrarFatura(Fatura fatura) {
        return faturaRepository.save(fatura);
    }
}
