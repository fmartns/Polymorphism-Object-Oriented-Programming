package br.univali.zoologico;

public abstract class Animal {
    protected String nome;
    protected int idade;
    
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public abstract void emitirSom();
    public void correr() {}
}
