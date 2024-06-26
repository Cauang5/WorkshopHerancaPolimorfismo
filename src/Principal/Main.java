package Principal;


import entities.Audio;
import entities.Musica;
import entities.Podcast;

public class Main {
    public static void main(String[] args) {
        // Criação de uma música
        Musica musica = new Musica("A Sky Full Stars", 5, 8, 8.9, "Ghosts Stories", "ColdPLay", "Pop");
        System.out.println(musica);
        musica.curte();
        System.out.println();

        // Criação de um podcast
        Podcast podcast = new Podcast("Hipsters Ponto Tech", 100, 80, 9.5, "Paulo Silveira", 300, "Tecnologia");
        System.out.println(podcast);
        podcast.reproduz();
        podcast.curte();
        System.out.println();

        // Demonstração de herança e polimorfismo
        Audio audio1 = musica; // Polimorfismo
        Audio audio2 = podcast; // Polimorfismo

        System.out.println(audio1);
        System.out.println(audio2);



        System.out.println("-----------------------------------");
        // Polimorfismo sobrecarga demonstração
        Audio audio = new Audio("Generic Audio Title", 150, 60, 4.0);

        // Chama o método `reproduz` sem parâmetros
        audio.reproduz();

        // Chama o método `reproduz` com um inteiro, reproduzindo várias vezes
        audio.reproduz(3);

        // Chama o método `reproduz` com um booleano, reproduzindo em alta qualidade
        audio.reproduz(true);

    }
}
