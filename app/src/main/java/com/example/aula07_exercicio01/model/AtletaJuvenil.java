/*
 *@author:<Leonardo Lima 1110482423021>
 */
package com.example.aula07_exercicio01.model;

import androidx.annotation.NonNull;

public class AtletaJuvenil extends Atleta{
    private int qtdAnos;

    public AtletaJuvenil() {
        super();
    }

    public int getQtdAnos() {
        return qtdAnos;
    }

    public void setQtdAnos(int qtdAnos) {
        this.qtdAnos = qtdAnos;
    }

    @NonNull
    @Override
    public String toString() {
        return "AtletaJuvenil{" +
                "nome=" + getNome() + '\'' +
                ", data nascimento=" + getDataNasc() + '\'' +
                ", bairro=" + getBairro() + '\'' +
                "qtdAnos=" + qtdAnos +
                '}';
    }
}
