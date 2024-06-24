package Principal;


import entities.Audio;
import entities.Musica;
import entities.Podcast;

public class Main {
    public static void main(String[] args) {
        // Criação de uma música
        Musica musica = new Musica();
        musica.setTitulo("Imagine");
        musica.setArtista("John Lennon");
        musica.setAlbum("Imagine");
        musica.setGenero("Rock");
        musica.setClassificacao(4.5);
        musica.reproduz();
        musica.curte();
        System.out.println();

        // Criação de um podcast
        Podcast podcast = new Podcast();
        podcast.setTitulo("Tech Talk");
        podcast.setHost("Jane Doe");
        podcast.setTema("Tecnologia");
        podcast.setClassificacao(4.8);
        podcast.reproduz();
        podcast.curte();
        System.out.println();

        // Demonstração de herança e polimorfismo
        Audio audio1 = musica; // Polimorfismo
        Audio audio2 = podcast; // Polimorfismo

        System.out.println(audio1);
        System.out.println(audio2);

    }
}
