package com.example.aula07_exercicio01.model;

import androidx.annotation.NonNull;

public class AtletaSenior extends Atleta{
    private String problemaCardiaco;

    public String getProblemaCardiaco() {
        return problemaCardiaco;
    }

    public void setProblemaCardiaco(String problemaCardiaco) {
        this.problemaCardiaco = problemaCardiaco;
    }

    @NonNull
    @Override
    public String toString() {
        return "AtletaSenior{" +
                "nome=" + getNome() + '\'' +
                ", data nascimento=" + getDataNasc() + '\'' +
                ", bairro=" + getBairro() + '\'' +
                "problemaCardiaco=" + problemaCardiaco +
                '}';
    }
}
