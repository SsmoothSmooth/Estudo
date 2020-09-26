class Main {
    public static void main(String[] args) {
  
      ConexaoBanco.getInstance().conectar();
    
        // Faz o que tem q fazer no BD e sai
      ConexaoBanco.getInstance().desconectar();
    }
  }