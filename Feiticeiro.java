
public class Feiticeiro extends Mago {
  boolean validade;
  int vidaMax;
  String pocoes;
  Magia arma;
  private static final String CLASSE = "Feiticeiro";

  public Feiticeiro(int mana, String nome, int saude, String pocoes) {
    super(mana, nome, saude);
    this.validade = true;
    this.vidaMax = saude;
    this.arma = new Magia("Prisão dos condenados", 350, 60);
    this.pocoes = pocoes;
  }

  public String getClasse() {
    return CLASSE;
  }

  // PECULIARIDADE DA CLASSE
  public String getPocoes() {
    return this.pocoes;
  }

  @Override
  public void recebeuDano(int danoRecebido) {
    System.out.println(this.getNome() + " sofreu um HIT de " + danoRecebido + " de dano!");
    System.out.print("Estava com " + this.getSaude() + " HP, ");
    this.setSaude(this.getSaude() - danoRecebido);
    if (this.getSaude() < 0.2f * this.vidaMax && this.getSaude() > 0 && this.validade == true) { // Sempre que a vida
                                                                                                 // estiver abaixo de
                                                                                                 // 20% usa uma poção
                                                                                                 // que dobra a vida
                                                                                                 // atual
      this.setSaude(this.getSaude() * 2);
      this.validade = false;
      System.out.println(this.getNome() + " usou " + this.getPocoes());
    } else if (this.getSaude() <= 0 && this.validade == false) {
      this.setSaude(0);
    }
    System.out.println("Vida atual: " + this.getSaude() + " HP.");
  }

  @Override
  public int atacar() {
    int manaAtual = 300;
    this.setMana(manaAtual - 60);
    if (this.getMana() < 0) {
      this.arma.setDano(0); // Quando a mana acaba não é mais possível conjurar
    }

    return this.arma.getDano();
  }

  // -------------------------------------------------------
  // RETORNO INFO

  public String toString() {
    return "Nome: " + this.getNome() + ".\n" + "Classe: " + getClasse() + "\n" + "Vida: " + this.getSaude() + " HP."
        + "\nMana: " + this.getMana() + " SP" + "\n" + "Poção secreta: " + this.getPocoes() + "." + "\nArma: "
        + this.arma.getTipoArma() + "\nDano total: " + this.atacar();

  }
}