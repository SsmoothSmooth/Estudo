import java.util.*;

class Main {
  public static void main(String[] args) {
    ArrayList<String> carros = new ArrayList<String>();

    /*adicionando sempre no final do ArrayList*/
    carros.add("Ferrari");
    carros.add("Corvete");
    carros.add("BMW");
    System.out.println("Meus carros:"+carros);

    /*adicionando em índices específicos*/
    carros.add(0, "Mustang");
    carros.add(1, "Subaru");
    System.out.println("Meus carros:"+carros);
    
    /*Removendo elementos*/
    carros.remove("Ferrari");
    carros.remove("Corvete");
    System.out.println("Meus carros:"+carros);

    /*Removendo element de um determinado índice*/
    carros.remove(1);

    Collections.sort(carros);

    System.out.println("Meus carros:" + carros);
  }
}