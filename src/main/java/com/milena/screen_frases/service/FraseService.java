package com.milena.screen_frases.service;

import com.milena.screen_frases.dto.FraseDTO;
import com.milena.screen_frases.model.Frase;
import com.milena.screen_frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repository;

    public FraseDTO obterFraseAleatoria() {

      Frase frase = repository.buscaFraseAleatoria();
      return new FraseDTO(frase.getTitulo(),frase.getFrase(),frase.getPersonagem(),frase.getPoster());

    }
}
