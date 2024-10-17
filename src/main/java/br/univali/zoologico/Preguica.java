package br.univali.zoologico;

public class Preguica extends Animal {
    
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A preguiça gritou.");
    }

    public void subir() {
        System.out.println("A preguiça esta subindo a arvore.");
    }
}