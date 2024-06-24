package entities;

public class Musica extends Audio{

    private String album;
    private String artista;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public Musica setAlbum(String album) {
        this.album = album;
        return this;
    }

    public String getArtista() {
        return artista;
    }

    public Musica setArtista(String artista) {
        this.artista = artista;
        return this;
    }

    public String getGenero() {
        return genero;
    }

    public Musica setGenero(String genero) {
        this.genero = genero;
        return this;
    }

    @Override
    public void reproduz() {
        super.reproduz();
        System.out.println("Você está ouvindo a música: " + getTitulo() + " do artista: " + artista);
    }

    @Override
    public void curte() {
        super.curte();
        System.out.println("Você curtiu a música: " + getTitulo() + " do artista: " + artista);
    }

    @Override
    public String toString() {
        return "Musica [Título: " + getTitulo() + ", Artista: " + artista + ", Álbum: " + album +
                ", Gênero: " + genero + ", Reproduções: " + getTotalReproducoes() +
                ", Curtidas: " + getTotalCurtidas() + ", Classificação: " + getClassificacao() + "]";
    }
}
