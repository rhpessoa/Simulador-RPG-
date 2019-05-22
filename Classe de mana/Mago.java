
public class Mago extends Personagem {
  int mana, saude;
  String nome;

  public Mago(int mana, String nome, int saude) {
    this.mana = mana;
    this.nome = nome;
    this.saude = saude;
  }
//Código que recebe a mana
  public int getMana() {
    return this.mana;
  }
//Código que recebe a saude
  @Override
  public int getSaude() {
    return this.saude;
  }
//Código que recebe o nome 
  @Override
  public String getNome() {
    return this.nome;
  }
//Código que recebe o dano 
  @Override
  public void takeDamage(int dano) {
    System.out.println("Sofri um HIT de " + dano + " de dano!");
    System.out.print("Estava com " + getSaude() + " HP, ");
    this.saude = getSaude() - dano;
     System.out.println("Meus pontos de vida atuais são de " + saude + " HP.");
  }
//Código que retorna as informações da classe Mago
  public String toString() {
    return "Olá meu nome é " + this.getNome()+"!! "+"Sou um Mago(a). "+"\n" + "Tenho " + this.getSaude() + " HP"+"\n" + this.getMana() + " SP";
  }

}