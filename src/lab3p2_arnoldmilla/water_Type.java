package lab3p2_arnoldmilla;


public class water_Type extends Pokemon{
    private boolean vivir;
    private int nadar;

    public water_Type() {
    }

    public water_Type(boolean vivir, int nadar, String nombre, String naturaleza, int id, Pokebola pokebola) {
        super(nombre, naturaleza, id, pokebola);
        this.vivir = vivir;
        this.nadar = nadar;
    }

    public boolean isVivir() {
        return vivir;
    }

    public void setVivir(boolean vivir) {
        this.vivir = vivir;
    }

    public int getNadar() {
        return nadar;
    }

    public void setNadar(int nadar) {
        this.nadar = nadar;
    }

    @Override
    public String toString() {
        return super.toString() + " Tipo grama " + "Habilidad de vivir en el agua: " + vivir + "velocidad de nado: " + nadar;
    }
     
}
