

import java.util.Random;

public class Batalha {

    //Atributos
    private Personagem oponente1;
    private Personagem oponente2;
    private Personagem vencedor;
    private boolean aprovada;

    public void marcarBatalha(Personagem p1, Personagem p2) {
        if (p1 != p2) {
            this.aprovada = true;
            this.oponente1 = p1;
            this.oponente2 = p2;
        } else {
            this.aprovada = false;
            System.out.println("Luta não aprovada!");
        }
    }
    
    public void apresentar(){
        System.out.println("-------------------------------------");
        System.out.println("Oponente 1:\n"+oponente1.toString());
        System.out.println("-------------------------------------");
        System.out.println("Oponente 2:\n"+oponente2.toString());
    }

    public void comecarBatalha() {
        Random random = new Random();
        int aleatorio = random.nextInt(2);// Cria aleatório entre 0 e 1 que decide quem começa a atacar
        if (this.aprovada == true) {
            int round = 1;
            System.out.println("----------- BATALHA ----------------");
            while (true) {;
                if(aleatorio == 0){
                   System.out.println("\n");
                    System.out.println("-=-=-=-=-=-=-= Round " + round + " -=-=-=-=-=-=-=");
                    
                    this.oponente1.recebeuDano(this.oponente2.atacar());
                this.oponente1.toString();
                if (this.oponente1.getSaude() <= 0) {
                    this.vencedor = oponente2;
                    break;
                }
                this.oponente2.recebeuDano(this.oponente1.atacar());
                this.oponente2.toString();

                if (this.oponente2.getSaude() <= 0) {
                    this.vencedor = oponente1;
                    break;
                }
                round++;
                }
                else if(aleatorio == 1){
                    System.out.println("\n");
                    System.out.println("-=-=-=-=-=-=-= Round " + round + " -=-=-=-=-=-=-=");
                    System.out.println("\n");
                    this.oponente2.recebeuDano(this.oponente1.atacar());
                this.oponente2.toString();
                if (this.oponente2.getSaude() <= 0) {
                    this.vencedor = oponente1;
                    break;
                }
                this.oponente1.recebeuDano(this.oponente2.atacar());
                this.oponente1.toString();

                if (this.oponente1.getSaude() <= 0) {
                    this.vencedor = oponente2;
                    break;
                }
                round++;
                }
                
            }
            System.out.println("O vencedor foi: "+vencedor.getNome());
        }
    }
}
