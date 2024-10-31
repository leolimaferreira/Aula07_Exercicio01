package com.example.aula07_exercicio01.controller;

import com.example.aula07_exercicio01.model.AtletaJuvenil;

import java.util.ArrayList;
import java.util.List;

public class OperacaoAJ implements IOperacao<AtletaJuvenil>{

    private List<AtletaJuvenil> lista;

    public OperacaoAJ() {
        this.lista = new ArrayList<>();
    }
    @Override
    public void cadastrar(AtletaJuvenil atletaJuvenil) {
        lista.add(atletaJuvenil);
    }

    @Override
    public List listar() {
        return lista;
    }
}
