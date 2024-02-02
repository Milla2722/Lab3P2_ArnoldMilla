package lab3p2_arnoldmilla;


public class Pokebola {
    private String color;
    private int serie, efficiencia;

    public Pokebola() {
    }

    public Pokebola(String color, int serie, int efficiencia) {
        this.color = color;
        this.serie = serie;
        this.setEfficiencia(efficiencia);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getEfficiencia() {
        return efficiencia;
    }

    public void setEfficiencia(int efficiencia) {    
        if (efficiencia > 0 && efficiencia < 4){
            this.efficiencia = efficiencia;
        }      
    }

    @Override
    public String toString() {
        return "La pokebola tiene color: " + color + " con numero de serie: " + serie + " y una eficiencia de: " + efficiencia;
    }
    
    
}
