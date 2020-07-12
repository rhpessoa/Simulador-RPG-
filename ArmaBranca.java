

public class ArmaBranca extends Arma{
    String tipoArma;
    int dano;

    public ArmaBranca(String ta, int d) {
        this.tipoArma = ta;
        this.dano = d;
    }
    
        
    @Override
    public String getTipoArma(){
        return this.tipoArma;
    }

    @Override
    public int getDano() {
        return this.dano;
    }
    
}
