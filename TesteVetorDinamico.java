import java.util.Random;
public class TesteVetorDinamico {
  public static void main(String[] args) throws Exception {
    Random gerador = new Random();
    VetorDinamico v = new VetorDinamico();
    //valor aleatório
    //distribuição uniforme
    //[7, 10]: 0, 1, 2, ..., 9, 10
    while(true){
      int nota = 7 + gerador.nextInt(4);
      v.adicionar(nota);
      v.exibir();
      System.out.println("=====================");
      Thread.sleep(5000);
    }

  }  
}
