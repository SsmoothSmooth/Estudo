class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Forma q = new Quadrado(3);
    Forma r = new Retangulo(5, 2);

    System.out.println(q.obterArea());
    System.out.println(r.obterArea());
  }
}