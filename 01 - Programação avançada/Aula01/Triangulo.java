public class Triangulo extends Forma {
    private int lado;
    private int altura;

    public Triangulo(int lado, int altura) {
        this.lado = lado;
        this.altura = altura;
    }

    public double obterArea() {
        return ((this.lado * this.altura) / 2);
    }
}