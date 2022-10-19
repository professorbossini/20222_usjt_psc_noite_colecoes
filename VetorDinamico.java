public class VetorDinamico {
  private int [] elementos;
  private int quantidade;
  private int capacidade;
  public VetorDinamico(){
    this.quantidade = 0;
    this.capacidade = 4;
    this.elementos = new int[this.capacidade];
  }

  public void adicionar(int elemento){
    if(!estaCheio()){
      elementos[quantidade] = elemento;
      quantidade += 1; //quantidade++;  
    }
  }

  public void exibir(){
    System.out.printf("Qtde: %d\n", quantidade);
    System.out.printf("Cap: %d\n", capacidade);
    for (int i = 0; i < quantidade; i++)
      System.out.printf("%d ", elementos[i]);
    System.out.println();
  }

  public boolean estaCheio(){
    return capacidade == quantidade;
    // return capacidade == quantidade ? true : false;
    // if (capacidade == quantidade)
    //   return true;
    // return false;
  }

}
