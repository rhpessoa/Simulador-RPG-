
public class Mago extends Personagem {
  private int mana, saude;
  private String nome;
  private Magia arma;
  private static final String CLASSE = "Mago";

  public Mago(int mana, String nome, int saude) {
    this.arma = new Magia("Magia Negra", 350, 50);
    this.mana = mana;
    this.nome = nome;
    this.saude = saude;

  }

  // PECULIARIDADE DA CLASSE
  // Código que recebe a mana
  public int getMana() {
    return this.mana;
  }

  public void setMana(int m) {
    this.mana = m;
  }

  public String getClasse() {
    return this.CLASSE;
  }
  // ------------------------------------------------------

  // ATRIBUTOS/INFO PADRÕES

  // Código que recebe a saude
  @Override
  public int getSaude() {
    return this.saude;
  }

  // Código que recebe o nome
  @Override
  public String getNome() {
    return this.nome;
  }

  public void setSaude(int s) {
    this.saude = s;
  }

  // Código que recebe o dano
  @Override
  public void recebeuDano(int danoRecebido) {
    System.out.println(this.getNome() + " sofreu um HIT de " + danoRecebido + " de dano!");
    System.out.print("Estava com " + this.getSaude() + " HP, ");
    this.setSaude(this.getSaude() - danoRecebido);
    if (this.getSaude() <= 0) {
      this.setSaude(0);
    }
    System.out.println("Vida atual: " + this.getSaude() + " HP.");
  }

  @Override
  public int atacar() {
    this.setMana(this.getMana() - arma.getCustoMana());
    return this.arma.getDano();
  }
  // -------------------------------------------------------

  // RETORNO INFO

  // Código que retorna as informações da classe Mago
  public String toString() {
    return "Nome: " + this.getNome() + ".\n" + "Classe: " + this.getClasse() + "\n" + "Vida: " + this.getSaude()
        + " HP." + "\nMana: " + this.getMana() + " SP" + "\nArma: " + this.arma.getTipoArma() + "\nDano total: "
        + this.atacar();
  }
}