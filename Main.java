class Main {
  public static void main(String[] args) {
    Highlander h1, h2, h3;
    Fabrica Fabrica1 = new Fabrica(5);
    h2 = Highlander.obterInstancia();

    h3 = Highlander.obterInstancia();
    if (h2 == h3) {
      System.out.println("h2 e h3 são mesmo objeto!");
    }
}
}