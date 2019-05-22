public class Guerreiro extends Personagem {
  int forca, agilidade, saude;
  String nome;

  public Guerreiro(int forca, int agilidade, String nome, int saude) {
    this.forca = forca;
    this.agilidade = agilidade;
    this.nome = nome;
    this.saude = saude;
  }

  public int getForca() {
    return this.forca;
  }

  public int getAgilidade() {
    return this.agilidade;
  }

  @Override
  public int getSaude() {
    return this.saude;
  }

  @Override
  public String getNome() {
    return this.nome;
  }

  @Override
  public void takeDamage(int dano) {
    System.out.println("Sofri um HIT de " + dano + " de dano!");
    System.out.print("Estava com " + getSaude() + " HP, ");
    this.saude = getSaude() - dano;
    System.out.println("Meus pontos de vida atuais são de " + saude + " HP.");
  }

  public String toString() {
    return "Olá meu nome é " + this.getNome() + "!! " + "Sou um Guerreiro(a). " + "\n" + "Tenho " + this.getSaude()
        + " HP" + "\n" + this.getForca() + " For" + "\n" + this.getAgilidade() + " Agi";
  }
}
