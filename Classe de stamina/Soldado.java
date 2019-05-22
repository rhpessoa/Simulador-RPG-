public class Soldado extends Guerreiro {
  String armadura;

  public Soldado(int forca, int agilidade, String nome, int saude, String armadura){
    super(forca,agilidade,nome,saude);
    this.armadura = armadura;
   }

  public String getArmadura() {
    return this.armadura;
  }

  public String toString() {
    return "Olá meu nome é " + this.getNome() + "!! " + "Sou um Soldado(a). " + "\n" + "Tenho " + this.getSaude()
        + " HP" + "\n"+"Minha armadura lendária se chama "+this.getArmadura()+"!!"+"\n" + this.getForca() + " For" + "\n" + this.getAgilidade() + " Agi";
  }
}