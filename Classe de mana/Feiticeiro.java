public class Feiticeiro extends Mago {
  String pocoes;

  public Feiticeiro(int mana, String nome, int saude, String pocoes){
    super(mana, nome, saude);
    this.pocoes = pocoes;
  }
  public String getPocoes(){
    return this.pocoes;
  }

  public String toString() {
    return "Olá meu nome é " + this.getNome() + "!! " + "Sou um Feiticeiro(a). " + "\n" + "Tenho " + this.getSaude()
        + " HP" + "\n" + this.getMana() + " SP" + "\n" + "Minha poção secreta se chama " + this.getPocoes() + ".";
  }
}