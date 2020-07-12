
public class Guerreiro extends Personagem {
  private int forca, agilidade, saude;
  private String nome;
  private ArmaBranca arma;
  private static final String CLASSE = "Guerreiro";

  public Guerreiro(int forca, int agilidade, String nome, int saude) {
    this.arma = new ArmaBranca("Espada", 100);
    this.forca = forca;
    this.agilidade = agilidade;
    this.nome = nome;
    this.saude = saude;
  }

  // PECULIARIDADE DA CLASSE
  public int getForca() {
    return this.forca;
  }

  public int getAgilidade() {
    return this.agilidade;
  }

  public String getClasse() {
    return CLASSE;
  }
  // -----------------------------------------------------
  // ATRIBUTOS/INFO PADRÕES

  @Override
  public int getSaude() {
    return this.saude;
  }

  public void setSaude(int s) {
    this.saude = s;
  }

  @Override
  public String getNome() {
    return this.nome;
  }

  @Override
  public void recebeuDano(int danoRecebido) {
    System.out.println(this.getNome() + " sofreu um HIT de " + danoRecebido + " de dano!");
    System.out.print("Estava com " + this.getSaude() + " HP, ");
    this.setSaude(getSaude() - danoRecebido);
    if (this.getSaude() <= 0) {
      this.setSaude(0);
    }
    System.out.println("Vida atual: " + this.getSaude() + " HP.");
  }

  @Override
  public int atacar() {
    return (this.getForca() * this.getAgilidade()) + this.arma.getDano(); // Agilidade pondera a força

  }

  // ------------------------------------------------------
  // RETORNO INFO
  public String toString() {
    return "Nome: " + this.getNome() + ".\nClasse: " + getClasse() + "\nVida: " + this.getSaude() + " HP." + "\nForça: "
        + this.getForca() + "\nAgilidade: " + this.getAgilidade() + "\nArma: " + this.arma.getTipoArma()
        + "\nDano total: " + this.atacar();
  }
}