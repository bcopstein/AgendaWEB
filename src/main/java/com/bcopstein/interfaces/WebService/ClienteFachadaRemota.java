package com.bcopstein.interfaces.WebService;

import com.bcopstein.casosDeUso.Servicos.ServicosAgenda;
import com.bcopstein.entidades.EntradaAgenda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin  // habilita cors de todas as origens
@RequestMapping("/agendaweb")
public class ClienteFachadaRemota {
    private ServicosAgenda servicosAgenda;

    @Autowired
    public ClienteFachadaRemota(ServicosAgenda servicosAgenda){
        this.servicosAgenda = servicosAgenda;
    }

    @GetMapping("/recuperaPorNomeSobrenome")
    public EntradaAgendaDTO getDadosViagem(@RequestParam String nome,
                                           @RequestParam String sobreNome){
        System.out.println("Parametros recebidos: "+nome+", "+sobreNome);
        EntradaAgenda eag = servicosAgenda.recuperaPorNomeCompleto(nome, sobreNome);
        if (eag != null){
            return EntradaAgendaDTO.fromEntradaAgenda(eag);
        }else{
            throw new IllegalArgumentException("Nome nao encontrado");
        }
    }

    @PostMapping("/recuperaPorNomeSobrenome")
    public EntradaAgendaDTO getDadosViagemPost(@RequestBody NomeSobrenomeDTO dados){
        System.out.println("Parametros recebidos: "+dados.nome+", "+dados.sobrenome);
        EntradaAgenda eag = servicosAgenda.recuperaPorNomeCompleto(dados.nome, dados.sobrenome);
        if (eag != null){
            return EntradaAgendaDTO.fromEntradaAgenda(eag);
        }else{
            throw new IllegalArgumentException("Nome nao encontrado");
        }
    }
}