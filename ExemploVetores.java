import javax.swing.JOptionPane;

public class ExemploVetores{
  public static void main(String[] args) {
    int [] notas = new int[35];
    for (int i = 0; i < notas.length; i++){
      notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Nota do " + (i + 1) + " aluno"));   
    }

    //calcular a média (nomes de A a J)
    double media = 0;
    int i = 0;
    while (i < notas.length){
      media = media + notas[i]; //media += notas[i];
      i++;
    }
    media = media / notas.length;

    //achar a maior nota(nomes de K a Z)

    int maior = notas[0];
    for (i = 1; i < notas.length; i++){
      maior = notas[i] > maior ? notas[i] : maior;
    }
    System.out.println(maior);
  }
}
   
   
   
   











    //péssima ideia
    // notas[0] = Integer.parseInt(JOptionPane.showInputDialog("Nota do 1 aluno"));
    // notas[1] = Integer.parseInt(JOptionPane.showInputDialog("Nota do 2 aluno"));
    // notas[2] = Integer.parseInt(JOptionPane.showInputDialog("Nota do 3 aluno"));
    // notas[3] = Integer.parseInt(JOptionPane.showInputDialog("Nota do 4 aluno"));
   
   
   
   
   
   
   
   
   
    // [] é especial no contexto de estudos sobre vetores
    //1. Declarar uma variável de referência
    //2. Construir um objeto "vetor" ou "array"
    // int [] notas = new int [4];
    // notas[0] = 7;
    // notas[3] = 10;
    // notas[1] = 8;
    // notas[2] = 8;
    // notas[1] = notas[2] = 8;
    // notas[2] = 9;
    // double media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;
    // System.out.println(notas[0]);