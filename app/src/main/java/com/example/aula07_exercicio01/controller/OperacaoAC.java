/*
 *@author:<Leonardo Lima 1110482423021>
 */
package com.example.aula07_exercicio01.controller;

import com.example.aula07_exercicio01.model.AtletaComum;
import com.example.aula07_exercicio01.model.AtletaJuvenil;

import java.util.ArrayList;
import java.util.List;

public class OperacaoAC implements IOperacao<AtletaComum> {

    private List<AtletaComum> lista;

    public OperacaoAC() {
        this.lista = new ArrayList<>();
    }
    @Override
    public void cadastrar(AtletaComum atletaComum) {
        lista.add(atletaComum);
    }

    @Override
    public List listar() {
        return lista;
    }
}
