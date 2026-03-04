package com.example.zoologicodocaos.models;
import java.util.HashMap;

/**
 * Escreva uma descrição da classe ZoologicoDoCaos aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ZoologicoDoCaos
{
    private String nome;
    HashMap<String, Animal> animais;
    
    public ZoologicoDoCaos(String nome) {
        this.nome = nome;
        
        this.animais = new HashMap<>();
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public HashMap getAnimais() {
        return this.animais;
    }
    
    public void adicionarAnimal(Animal novoAnimal) {
        String key = novoAnimal.getEspecie();
        
        this.animais.put(key, novoAnimal);
    }
    
    public void removerAnimal(Animal animalParaRemover) {
        this.animais.remove(animalParaRemover.getEspecie());
    }
    
    public void removerTodosAnimais(){
        this.animais.clear();
    }
    
    @Override
    public String toString() { 
        return " - " + this.nome + " - " + this.animais.toString();    
    }
} 