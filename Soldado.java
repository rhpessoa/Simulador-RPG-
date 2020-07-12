
public class Soldado extends Guerreiro {
  int armadura;
  private static final String CLASSE = "Soldado";

  public Soldado(int forca, int agilidade, String nome, int saude, int armadura) {
    super(forca, agilidade, nome, saude);
    this.armadura = armadura;
  }

  public String getClasse() {
    return CLASSE;
  }

  // PECULIARIDADE DA CLASSE
  public int getArmadura() {
    return this.armadura;
  }

  @Override
  public void recebeuDano(int danoRecebido) {
    System.out.println(this.getNome() + " sofreu um HIT de " + danoRecebido + " de dano!");
    System.out.print("Estava com " + this.getSaude() + " HP, ");
    if (danoRecebido - this.getArmadura() < 0) {
      System.out.println("Protegido");
    } else if (danoRecebido - this.getArmadura() > 0) {
      this.setSaude(getSaude() - (danoRecebido - this.getArmadura())); // Armadura faz receber menos dano
    }
    if (this.getSaude() <= 0) {
      this.setSaude(0);
    }

    System.out.println("Vida atual: " + this.getSaude() + " HP.");
  }

  // ------------------------------------------------------
  // RETORNO INFO
  public String toString() {
    return "Nome: " + this.getNome() + ".\nClasse: " + getClasse() + "\nVida: " + this.getSaude() + " HP."
        + "\nArnadura: " + this.getArmadura() + "\nForça: " + this.getForca() + "\nAgilidade: " + this.getAgilidade()
        + "\nDano total: " + this.atacar();
  }

}