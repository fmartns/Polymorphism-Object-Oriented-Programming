package br.univali.zoologico;

public class Cavalo extends Animal {
    
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cavalo relinchou.");
    }

    @Override
    public void correr() {
        System.out.println("O cavalo está correndo.");
    }
}