package com.example.aula07_exercicio01.controller;

import com.example.aula07_exercicio01.model.AtletaJuvenil;
import com.example.aula07_exercicio01.model.AtletaSenior;

import java.util.ArrayList;
import java.util.List;

public class OperacaoAS implements IOperacao<AtletaSenior> {

    private List<AtletaSenior> lista;

    public OperacaoAS() {
        this.lista = new ArrayList<>();
    }
    @Override
    public void cadastrar(AtletaSenior atletaSenior) {
        lista.add(atletaSenior);
    }

    @Override
    public List listar() {
        return lista;
    }
}
