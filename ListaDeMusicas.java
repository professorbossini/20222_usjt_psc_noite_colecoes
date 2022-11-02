import java.util.*;

import javax.swing.JOptionPane;
public class ListaDeMusicas {
  public static void main(String[] args) {
    // <> generics do Java, existe desde a versão 5
    List <Musica> musicas = new ArrayList <> ();
    String menu = "1-Cadastrar música\n2-Avaliar música\n3-Ver lista ordenada\n0-Sair";
    int op;
    do{
      op = Integer.parseInt(JOptionPane.showInputDialog(menu));
      switch (op){
        case 1:
          String musicaInserir = JOptionPane.showInputDialog("Qual o nome da música");
          Musica m = new Musica(musicaInserir);
          musicas.add(m);
          JOptionPane.showMessageDialog(null, "Música cadastrada");
          break;
        case 2:

          break;
        case 3:
            String resultado = "";
            //for each ou enhanced for
            // for (Musica musica : musicas){
            //   resultado += musica.getTitulo();
            // }
            for (int i = 0; i < musicas.size(); i++){
              resultado +=  musicas.get(i).getTitulo() + "\n";
            }
            JOptionPane.showMessageDialog(null, resultado);
          break;
        case 0:
            JOptionPane.showMessageDialog(null, "Até mais");
          break;
        default:
            JOptionPane.showMessageDialog(null, "Opção inválida");
          break;
      }
    }while (op != 0);
  }
}
