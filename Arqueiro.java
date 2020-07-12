
public class Arqueiro extends Guerreiro {
  String ataque;
  Arma arma;
  private static final String CLASSE = "Arqueiro";

  public Arqueiro(int forca, int agilidade, String nome, int saude, String ataque) {
    super(forca, agilidade, nome, saude);
    arma = new ArmaBranca("Baladeira", 80);
    this.ataque = ataque;
  }

  public String getClasse() {
    return CLASSE;
  }

  // PECULIARIDADE DA CLASSE
  public String getAtaque() {
    return this.ataque;
  }

  @Override
  public int atacar() {
    return (this.getForca() + (this.arma.getDano() * this.getAgilidade())); // Agilidade pondera o dano da arma

  }

  // ------------------------------------------------------
  // RETORNO INFO
  public String toString() {
    return "Nome: " + this.getNome() + ".\nClasse: " + getClasse() + "\nVida: " + this.getSaude() + " HP."
        + "\nAtaque: " + this.getAtaque() + "\nForça: " + this.getForca() + "\nAgilidade: " + this.getAgilidade()
        + "\nArma: " + this.arma.getTipoArma() + "\nDano total: " + this.atacar();
  }
}