package br.univali.zoologico;

public class Zoologico {
    private Animal[] jaulas = new Animal[10];
    
    public void adicionarAnimal(int jaula, Animal animal) {
        if (jaula >= 0 && jaula < jaulas.length) {
            jaulas[jaula] = animal;
        }
    }

    public void percorrerJaulas() {
        for (Animal animal : jaulas) {
            if (animal != null) {
                animal.emitirSom();
                animal.correr();
            }
        }
    }
}
