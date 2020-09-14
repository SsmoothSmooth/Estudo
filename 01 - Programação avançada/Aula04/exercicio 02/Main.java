public class Main {
  public static void main(String[] args) {
    Line l1 = new Line();
    l1.add(new Cell("João"));
    l1.add(new Cell("Maria"));
    l1.add(new Cell("José"));

    Line l2 = new Line();
    l2.add(new Cell("10"));
    l2.add(new Cell("10"));
    l2.add(new Cell("7.5"));

    Table t = new Table();
    t.add(l1);
    t.add(l2);
    t.print();
  }
}