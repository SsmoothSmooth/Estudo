public class AlunoEquals {
  private String nome;
  private int ra;

  public AlunoEquals(String nome, int ra) {
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

    if (!(o instanceof AlunoEquals)) {
      return false;
    }

    AlunoEquals other = (AlunoEquals) o;

    return this.getNome() == other.getNome() && this.hashCode() == other.hashCode();    
  }
}