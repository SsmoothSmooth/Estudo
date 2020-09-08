class Main {
  public static void main(String[] args) {

    Aluno a1 = new Aluno("Joao", 1234);
    Aluno a2 = new Aluno("Joao", 1234);   
    Aluno a3 = new Aluno("José", 1234);
    Aluno a4 = new Aluno("Joao", 4567);

    System.out.println(a1.equals(a2));
    System.out.println(a1.equals(a3));
    System.out.println(a1.equals(a4));

    AlunoEquals ae1 = new AlunoEquals("Joao", 1234);
    AlunoEquals ae2 = new AlunoEquals("Joao", 1234);   
    AlunoEquals ae3 = new AlunoEquals("José", 1234);
    AlunoEquals ae4 = new AlunoEquals("Joao", 4567);

    System.out.println(ae1.equals(ae2));
    System.out.println(ae1.equals(ae3));
    System.out.println(ae1.equals(ae4));
  }
}