public class Arqueiro extends Guerreiro {
  String ataque;

  public Arqueiro(int forca, int agilidade, String nome, int saude, String ataque){
    super(forca,agilidade,nome,saude);
    this.ataque = ataque;
   }

  public String getAtaque() {
    return this.ataque;
  }

  public String toString() {
    return "Olá meu nome é " + this.getNome() + "!! " + "Sou um Arqueiro(a). " + "\n" + "Tenho " + this.getSaude()
        + " HP" + "\n"+"Meu ataque mais forte se chama:"+this.getAtaque()+"!!"+"\n" + this.getForca() + " For" + "\n" + this.getAgilidade() + " Agi";
  }
}