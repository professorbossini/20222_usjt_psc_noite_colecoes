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
    if(estaCheio())
      aumentarCapacidade();
    elementos[quantidade] = elemento;
    quantidade += 1; //quantidade++;  
  }

  public void remover(){
    if (!estaVazio())
      quantidade--;
  }

  private void aumentarCapacidade(){
    //1. alocar um vetor com o dobro da capacidade atual
    int [] aux = new int[capacidade * 2];
    //2.copiar todo mundo do vetor antigo para o novo
    for (int i = 0; i < quantidade; i++ ){
      aux[i] = elementos[i];
    }
    //3. a variável elementos referencie o novo vetor
    elementos = aux;
    //4. ajustar a capacidade para que ela passe a valer o dobro
    capacidade *= 2;
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

  public boolean estaVazio(){
    return quantidade == 0;
  }

}
