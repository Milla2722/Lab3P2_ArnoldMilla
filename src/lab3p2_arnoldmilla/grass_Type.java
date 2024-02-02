package lab3p2_arnoldmilla;


public class grass_Type extends Pokemon{
      private String habitat;
      private int dom;

    public grass_Type() {
    }

    public grass_Type(String habitat, int dom, String nombre, String naturaleza, int id, Pokebola pokebola) {
        super(nombre, naturaleza, id, pokebola);
        this.habitat = habitat;
        this.dom = dom;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getDom() {
        return dom;
    }

    public void setDom(int dom) {
        this.dom = dom;
    }

    @Override
    public String toString() {
        return super.toString() + " Tipo grama" + " vive en: " + habitat + " su dominio de grama es de: " + dom;
    }
      
      
}
