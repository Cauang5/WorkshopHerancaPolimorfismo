package entities;

public class Audio {

    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private double classificacao;

    public Audio(){

    }

    public Audio(String titulo, int totalReproducoes, int totalCurtidas, double classificacao) {
        this.titulo = titulo;
        this.totalReproducoes = totalReproducoes;
        this.totalCurtidas = totalCurtidas;
        this.classificacao = classificacao;
    }

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

    // Sobrecarga do método `reproduz` com diferentes assinaturas
    public void reproduz(int vezes) {
        for (int i = 0; i < vezes; i++) {
            reproduz();
        }
    }

    public void reproduz(boolean altaQualidade) {
        if (altaQualidade) {
            System.out.println("Reproduzindo áudio em alta qualidade...");
        } else {
            reproduz();
        }
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
