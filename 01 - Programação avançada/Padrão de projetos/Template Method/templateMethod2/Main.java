import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {
    System.out.println("=========PRE JOGO=========");
    Treinamento t1 = new PreJogo();
    t1.realizarTreinamento();
    
    System.out.println("======PRE TEMPORADA=======");
    Treinamento t2 = new PreTemporada();
    t2.realizarTreinamento();    

    System.out.println("======TREINO DIARIO=======");
    Treinamento t3 = new TreinoDiario();
    t3.realizarTreinamento();    
  }
}