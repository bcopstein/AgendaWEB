package com.bcopstein.interfaces.Persistencia;

import java.nio.file.NoSuchFileException;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

import com.bcopstein.casosDeUso.Repositorios.RepositorioAgenda;
import com.bcopstein.entidades.Endereco;
import com.bcopstein.entidades.EntradaAgenda;
import com.bcopstein.entidades.Telefone;

import org.springframework.stereotype.Service;

@Service
public class RepositorioAgendaImplMemoria implements RepositorioAgenda {
    private static int id = 0;
    private final List<EntradaAgenda> agenda;

    private void cadastraEntrada(final String nome, final String sobrenome, final Endereco endereco,
            final Telefone telefone, final GregorianCalendar dataNascimento) {
        id++;
        agenda.add(new EntradaAgenda(id + "", nome, sobrenome, endereco, telefone, dataNascimento));
    }

    public RepositorioAgendaImplMemoria() {
        agenda = new LinkedList<>();

        // cadastro pré-definido
        cadastraEntrada("Aluizio", "Cardoso",
                Endereco.criaEnderecoBrasileiro("Osvaldo Aranha", "500", "302", "901234600"),
                Telefone.criaCelular(51, "998776509"), new GregorianCalendar(1985, 10, 23));
        cadastraEntrada("Mariana", "Osonski",
                Endereco.criaEnderecoBrasileiro("Getulio Vargas", "223", "72", "90766514"),
                Telefone.criaCelular(51, "988705326"), new GregorianCalendar(1992, 9, 2));

        cadastraEntrada("Ana Lucia", "Santarem",
                Endereco.criaEnderecoBrasileiro("Felipe Neri", "402", "905", "90020345"),
                Telefone.criaCelular(51, "988799045"), new GregorianCalendar(2004, 2, 12));
    }

    @Override
    public EntradaAgenda recuperaPorNomeSobreNome(String nome, String sobrenome) {
        try {
            EntradaAgenda ea = 
                agenda
                .stream()
                .filter(e -> e.getNome().equalsIgnoreCase(nome))
                .filter(e -> e.getSobreNome().equalsIgnoreCase(sobrenome))
                .findFirst()
                .get();
                return ea;
        } catch (NoSuchElementException e) {
            return null;
        }
    }
}