
import java.util.Scanner;
public class Main {
    public static void imprimir(Personagem p){
        System.out.println(p.toString());
        System.out.println("----------------------------");
    }
 
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Personagem p[] = new Personagem[6];
    // PERSONAGEM MAGO
    Personagem mago = new Mago(200, "Ariana", 650);
    p[0] = mago;
    //imprimir(mg);

    //System.out.println("-----------------------------");
    // PERSONAGEM APRENDIZ
    Personagem aprendiz = new Aprendiz(200, "Livro", 1000, "Yuumi");
    p[1] = aprendiz;
    //imprimir(nv);

    //System.out.println("-----------------------------");
    // PERSONAGEM FEITICEIRO
    Personagem feiticeiro = new Feiticeiro(300, "Morgana", 1100, "Cura dos desesperados");
    p[2] = feiticeiro;
    //imprimir(wf);

    //System.out.println("-----------------------------");
    // PERSONAGEM GUERREIRO
    Personagem guerreiro = new Guerreiro(20, 2, "Ornn", 3500);
    p[3] = guerreiro;
    //imprimir(wr);
    
    //System.out.println("-----------------------------");
    // PERSONAGEM ARQUEIRO
    Personagem arqueiro = new Arqueiro(10, 4, "Luciano", 1200, "Chuva de flechas");
    p[4] = arqueiro;
    //imprimir(ea);
    
    //System.out.println("-----------------------------");
    // PERSONAGEM SOLDADO 
    Personagem soldado = new Soldado(25, 3, "Patheon", 2000, 150);
    p[5] = soldado;
    //imprimir(wb);    
    
    Batalha b1 = new Batalha();

    //Menu
    int op = 0;
    int sn;
    int oponente1, oponente2;
    while(op >=0){
      System.out.println("Vamos batalhar!");
      System.out.println("Personagens:");
      System.out.println("----------------------------");
      for(int i = 0; i <=5; i++){
        System.out.println("DIGITE "+(i+1)+" PARA ESCOLHER");
        imprimir(p[i]);
               
      }
      System.out.print("Escolha o oponente 1: ");
      oponente1 = entrada.nextInt();
      System.out.print("Escolha o oponente 2: ");
      oponente2 = entrada.nextInt();
      
      b1.marcarBatalha(p[oponente1-1],p[oponente2-1]);
      b1.apresentar();
      b1.comecarBatalha(); 

      System.out.print("\nDeseja batalhar de novo? [(1) - Sim; (-1) - Não]: ");
      op = entrada.nextInt();
      

    }  
  }  
}