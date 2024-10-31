/*
 *@author:<Leonardo Lima 1110482423021>
 */
package com.example.aula07_exercicio01.controller;

import java.util.List;

public interface IOperacao<T> {
    public void cadastrar(T t);
    public List<T> listar();
}
