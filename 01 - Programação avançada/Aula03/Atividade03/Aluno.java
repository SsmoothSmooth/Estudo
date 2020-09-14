public class Aluno implements java.lang.Comparable {
  private String nome;
  private int ra;

  public Aluno(String nome, int ra) {
    this.nome = nome;
    this.ra = ra;
  }

  public String getNome() {
    return nome;
  }

  public int getRa() {
    return ra;
  }

  public int hashCode() {
    return ("" + nome + ra).hashCode();
  }

  public boolean equals(Object o) {
    if (o == null) {
      return false;
    }

    if (!(o instanceof Aluno)) {
      return false;
    }

    Aluno other = (Aluno) o;

    return this.getNome() == other.getNome() && this.hashCode() == other.hashCode();    
  }

  public int compareTo(Object o) {
    if (this.equals(o)) {      
      return 0;
    }

    if (o == null) {
      return -1;
    }

    Aluno other = (Aluno) o;    
  
    int compare = this.getNome().compareTo(other.getNome());

    if (compare == 0) {
      compare = this.getRa() - other.getRa();
    }        

    return compare;
  }
}