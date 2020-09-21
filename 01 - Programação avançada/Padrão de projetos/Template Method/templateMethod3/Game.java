public abstract class Game { 
   abstract void initialize();
   abstract void startPlay();
   abstract void endPlay();

   //template method
   public final void play(){

      //Inicializando o jogo
      initialize();

      //começando o jogo
      startPlay();

      //Finalizando o jogo
      endPlay();
   }
}