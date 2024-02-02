package lab3p2_arnoldmilla;


public class fire_Type extends Pokemon{
    private int potencia;

    public fire_Type() {
    }

    public fire_Type(int potencia, String nombre, String naturaleza, int id, Pokebola pokebola) {
        super(nombre, naturaleza, id, pokebola);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }


    @Override
    public String toString() {
        return super.toString() + " Tipo fuego " + " con llamas con potencia: " + potencia;
    }
    
    
}
