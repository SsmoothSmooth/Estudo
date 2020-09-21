class Main {
  public static void main(String[] args) {
    Game game = new Volei();
    game.play();

    System.out.println();

    game = new Futebol();
    game.play();

    System.out.println();

    game = new CyberPunk();
    game.play();

  }
}