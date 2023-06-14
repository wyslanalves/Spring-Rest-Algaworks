package com.algaworks.algatransito.api.controller;

import com.algaworks.algatransito.domain.model.Proprietario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProprietarioController {

    @GetMapping("/proprietarios")
    public List<Proprietario> listar(){
        var pro1 = new Proprietario();
        pro1.setId(1L);
        pro1.setNome("Wyslan");
        pro1.setEmail("wyslan@gmail.com");
        pro1.setTelefone("83987290083");

        var pro2 = new Proprietario();
        pro2.setId(2L);
        pro2.setNome("Ana");
        pro2.setEmail("ana@gmail.com");
        pro2.setTelefone("83987290083");

        return Arrays.asList(pro1, pro2);
    }
}
