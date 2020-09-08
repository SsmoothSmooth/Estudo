class Main {
  public static void main(String[] args) {

    Aluno[] alunos = {
      new Aluno("Joao", 789),
      new Aluno("José", 456),
      new Aluno("Joao", 123),
      new Aluno("Maria", 987)      
    };
    
    printArray(alunos);

    java.util.Arrays.sort(alunos);    

    printArray(alunos);
  }

  public static void printArray(Aluno[] alunos) {
    for (Aluno a : alunos) {
      if (a != null) {
        System.out.println(a.getNome() + ": " + a.getRa());
      }
      else {
        System.out.println("null");
      }
    }
  }
}