package com.example.zoologicodocaos.models;
import java.lang.StringBuilder;

/**
 * Escreva uma descrição da classe Animal aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Animal
{
    private String especie;
    private String habilidade;
    
    public Animal(String especie, String habilidade) {
        this.especie = especie;
        this.habilidade = habilidade;
    }
    
    public String getEspecie() {
        return this.especie;
    }
    
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public String getHabilidade() {
        return this.habilidade;
    }
    
    public void setHabilidade(String habilidade) {
        this.especie = habilidade;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("-Especie-").append(this.especie);
        sb.append("-Habilidade-").append(this.habilidade);
        
        return sb.toString();
    }
}