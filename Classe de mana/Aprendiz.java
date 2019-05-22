public class Aprendiz extends Mago {
  String pet;

  public Aprendiz(int mana, String nome, int saude, String pet) {
    super(mana, nome, saude);
    this.pet = pet;
  }

  public String getPet() {
    return this.pet;
  }

  public String toString() {
    return "Olá meu nome é " + this.getNome() + "!! " + "Sou um(a) Aprendiz. " + "\n" + "Tenho " + this.getSaude()
        + " HP" + "\n" + this.getMana() + " SP" + "\n" + "Meu Pet se chama " + this.getPet() + ".";
  }
}
