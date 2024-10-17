import br.univali.zoologico.Cachorro;
import br.univali.zoologico.Cavalo;
import br.univali.zoologico.Preguica;
import br.univali.zoologico.Veterinario;
import br.univali.zoologico.Zoologico;

public class Main {
    public static void main(String[] args) {
        // Criando animais
        Cachorro cachorro = new Cachorro("Rex", 5);
        Cavalo cavalo = new Cavalo("Faisca", 3);
        Preguica preguica = new Preguica("Sono", 4);

        // Examinando os animais
        Veterinario vet = new Veterinario();
        vet.examinar(cachorro);
        vet.examinar(cavalo);
        vet.examinar(preguica);

        // Criando zoológico
        Zoologico zoo = new Zoologico();
        zoo.adicionarAnimal(0, cachorro);
        zoo.adicionarAnimal(1, cavalo);
        zoo.adicionarAnimal(2, preguica);
        zoo.adicionarAnimal(3, cachorro);
        zoo.adicionarAnimal(4, cavalo);
        zoo.adicionarAnimal(5, preguica);
        zoo.adicionarAnimal(6, cachorro);
        zoo.adicionarAnimal(7, cavalo);
        zoo.adicionarAnimal(8, preguica);
        zoo.adicionarAnimal(9, preguica);

        // Percorrendo as jaulas
        zoo.percorrerJaulas();
    }
}
