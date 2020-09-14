import java.util.*;

public class Table {
  private List<Line> lines = new ArrayList<Line>();
  
  public void add(Line l) {
    lines.add(l);
  }

  public void print() {
    for (Line l : lines) {
      l.print();
    }
  }
}