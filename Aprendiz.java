
public class Aprendiz extends Mago {

  int vidaMax;
  boolean validade; // variável de controle, pet só pode salvar 1 vez
  String pet;
  Magia arma;
  private static final String CLASSE = "Aprendiz";

  public Aprendiz(int mana, String nome, int saude, String pet) {
    super(mana, nome, saude);
    this.vidaMax = saude;
    this.validade = true;
    this.pet = pet;
    this.arma = new Magia("Sopro congelante", 250, 40);
  }

  public String getClasse() {
    return CLASSE;
  }

  // PECULIARIDADE DA CLASSE
  public String getPet() {
    return this.pet;
  }

  @Override
  public void recebeuDano(int danoRecebido) {
    System.out.println(this.getNome() + " sofreu um HIT de " + danoRecebido + " de dano!");
    System.out.print("Estava com " + this.getSaude() + " HP, ");
    this.setSaude(this.getSaude() - danoRecebido);
    if (this.getSaude() <= 0 && validade == true) { // Na primeira vez que morrer, seu pet irá salvá-lo (uma única vez)
                                                    // e restituir 50% da vida
      this.setSaude(this.vidaMax / 2);
      System.out.println(this.getPet() + " salvou a(o) " + this.getNome());
      validade = false;
    }
    if (this.getSaude() <= 0 && validade == false) {
      this.setSaude(0);
    }
    System.out.println("Vida atual: " + this.getSaude() + " HP.");
  }

  @Override
  public int atacar() {
    this.setMana(this.getMana() - this.arma.getCustoMana());
    /*
     * if (this.getMana() < 0) { this.arma.setDano(0); //Quando a mana acaba não é
     * mais possível conjurar }
     */
    return this.arma.getDano();
  }

  // -------------------------------------------------------
  // RETORNO INFO
  public String toString() {
    return "Nome: " + this.getNome() + ".\n" + "Classe: " + getClasse() + "\n" + "Vida: " + this.getSaude() + " HP"
        + "\nMana: " + this.getMana() + " SP" + "\n" + "Pet: " + this.getPet() + "\nArma: " + this.arma.getTipoArma()
        + "\nDano total: " + this.atacar();
  }
}
