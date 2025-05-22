package com.financeiro.Controller;

import com.financeiro.domain.Pessoa.DadosCadastroPessoa;
import com.financeiro.domain.Pessoa.Pessoa;
import com.financeiro.domain.Pessoa.PessoaRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pessoas")
public class PessoaController {

    @Autowired
    private PessoaRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroPessoa dados) {

        repository.save(new Pessoa(dados));
    }


}

