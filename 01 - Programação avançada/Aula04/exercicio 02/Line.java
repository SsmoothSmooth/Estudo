import java.util.*;

public class Line {
  private List<Cell> cells = new ArrayList<Cell>();
 
  public void print() {
    int cellsCount = cells.size();

    // print the line
    int size = (cells.size() * 17) + (cellsCount + 1);
    char[] line = new char[size];
    java.util.Arrays.fill(line, '-');
  
    System.out.println(" " + new String(line));

    for (Cell c : cells) {
      c.print();
    }

    // print the bord
    System.out.println(" |");
  }
 
  public void add(Cell c) {
    cells.add(c);
  }
}