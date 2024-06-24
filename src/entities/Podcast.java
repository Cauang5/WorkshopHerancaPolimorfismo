package entities;

public class Podcast extends Audio{

    private String host;
    private int episodio;
    private String tema;

    public String host() {
        return host;
    }

    public Podcast setHost(String host) {
        this.host = host;
        return this;
    }

    public int episodio() {
        return episodio;
    }

    public Podcast setEpisodio(int episodio) {
        this.episodio = episodio;
        return this;
    }

    public String tema() {
        return tema;
    }

    public Podcast setTema(String tema) {
        this.tema = tema;
        return this;
    }

    @Override
    public void reproduz() {
        super.reproduz();
        System.out.println("Você está ouvindo o podcast: " + getTitulo() + " apresentado por: " + host);
    }

    @Override
    public void curte() {
        super.curte();
        System.out.println("Você curtiu o podcast: " + getTitulo() + " apresentado por: " + host);
    }

    @Override
    public String toString() {
        return "Podcast [Título: " + getTitulo() + ", Host: " + host + ", Episódios: " + episodio +
                ", Reproduções: " + getTotalReproducoes() +
                ", Curtidas: " + getTotalCurtidas() + ", Classificação: " + getClassificacao() + "]";
    }
}
