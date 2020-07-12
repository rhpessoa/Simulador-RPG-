
public class Magia extends Arma{
    private String tipoArma;
    private int dano, custoMana;

    public Magia(String ta, int d, int cm) {
        this.tipoArma = ta;
        this.dano = d;
        this.custoMana = cm;
    }
    
    public void setDano(int d){
        this.dano = d;
    }
    
    @Override
    public int getDano() {
        return this.dano;
    }

    @Override
    public String getTipoArma() {
        return this.tipoArma;
    }
    
    public int getCustoMana(){
        return this.custoMana;
    }
    
}
