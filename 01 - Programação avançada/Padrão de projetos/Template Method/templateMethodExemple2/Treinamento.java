/**
 * Base class of social network.
 */
public abstract class Treinamento {
    
    Treinamento() {}      

    // template method
    public void realizarTreinamento() {
      aquecimento();
      hidratacao();
      atividadeAerobica();
      hidratacao();
      recreacao();
    }

    protected void aquecimento() {
      System.out.println("aquecimento");
    }

    protected void hidratacao() {
      System.out.println("hidratacao");
    }

    protected void atividadeAerobica() {
      System.out.println("correr 30 minutos leve");
    }

    protected void recreacao() {
      System.out.println("recreacao");
    }
}