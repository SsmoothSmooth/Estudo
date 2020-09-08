import java.util.*;

public class Cell {
  private String content;
  
  public Cell(String content) {
    this.content = content;
  }
 
  public void print() {
    String printContent = content;
    
    // set limit to the content to 15 chars
    if (printContent.length() > 15) {
      printContent.substring(0, 15);
    }
    else {
      int emptySpace = 15 - printContent.length();
      
      for (int i = 0; i < emptySpace; i++) {
        printContent += " ";
      }
    }

    // print the cell and the bord
    System.out.print(" | " + printContent);
  }
}