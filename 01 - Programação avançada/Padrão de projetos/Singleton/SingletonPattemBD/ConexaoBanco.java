import java.sql.Connection;

public class ConexaoBanco {

  private Connection conexao;
  private String nomeBanco;

  private static ConexaoBanco instancia;

  private ConexaoBanco() {
    // Iniciar ...
    // Nome, usuario, senha, ip .....
  }

  public static synchronized ConexaoBanco getInstance(){
    if (instancia == null){
      instancia = new ConexaoBanco();
    }
    return instancia;
  }

  public void conectar(){
    System.out.println("Conectei");
  }

  public void desconectar(){
    System.out.println("Desconectei");
  }

  // demais funções get e set
  public void coisasDiversas (){
    System.out.println("Desconectei");
    
  }
}