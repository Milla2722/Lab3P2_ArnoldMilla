package lab3p2_arnoldmilla;

public class Pokemon {
    protected String nombre, naturaleza;
    protected int id;
    protected boolean atrapado = false;
    protected Pokebola pokebola = null;

    public Pokemon() {
    }

    public Pokemon(String nombre, String naturaleza, int id, Pokebola pokebola) {
        this.nombre = nombre;
        this.naturaleza = naturaleza;
        this.id = id;
        if (atrapado == true){
            this.pokebola = pokebola;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAtrapado() {
        return atrapado;
    }

    public void setAtrapado(boolean atrapado) {
        this.atrapado = atrapado;
        if (atrapado == true){
            this.pokebola = pokebola;
        }      
    }

    public Pokebola getPokebola() {
        return pokebola;
    }

    public void setPokebola(Pokebola pokebola) {
        this.pokebola = pokebola;
    }

    @Override
    public String toString() {
        return "Nombre del pokemon: " + nombre + " de naturaleza: " + naturaleza + " id de pokedex: " + id + " ha sido atrapado: " + atrapado + " pokebola con la que fue atrapado: " + pokebola;
    }
    
    
}
