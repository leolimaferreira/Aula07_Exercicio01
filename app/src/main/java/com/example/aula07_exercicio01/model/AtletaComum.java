/*
 *@author:<Leonardo Lima 1110482423021>
 */
package com.example.aula07_exercicio01.model;

import androidx.annotation.NonNull;

public class AtletaComum extends Atleta{
    private String academia;
    private double segundos;

    public String getAcademia() {
        return academia;
    }

    public void setAcademia(String academia) {
        this.academia = academia;
    }

    public double getSegundos() {
        return segundos;
    }

    public void setSegundos(double segundos) {
        this.segundos = segundos;
    }

    @NonNull
    @Override
    public String toString() {
        return "AtletaComum{" +
                "nome=" + getNome() + '\'' +
                ", data nascimento=" + getDataNasc() + '\'' +
                ", bairro=" + getBairro() + '\'' +
                ", academia='" + academia + '\'' +
                ", segundos=" + segundos +
                '}';
    }
}
