package entities;

public class Audio {

    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private double classificacao;

    public String getTitulo() {
        return titulo;
    }

    public Audio setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public Audio setTotalReproducoes(int totalReproducoes) {
        this.totalReproducoes = totalReproducoes;
        return this;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public Audio setTotalCurtidas(int totalCurtidas) {
        this.totalCurtidas = totalCurtidas;
        return this;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public Audio setClassificacao(double classificacao) {
        this.classificacao = classificacao;
        return this;
    }

    public void curte(){
        this.totalCurtidas++;
    }

    public void reproduz(){
        this.totalReproducoes++;
    }

    @Override
    public String toString() {
        return "Audio{" +
                "titulo='" + titulo + '\'' +
                ", totalReproducoes=" + totalReproducoes +
                ", totalCurtidas=" + totalCurtidas +
                ", classificacao=" + classificacao +
                '}';
    }

}
