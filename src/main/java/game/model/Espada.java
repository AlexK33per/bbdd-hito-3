package game.model;

public class Espada {
    private int idEspada;
    private String nombreEspada;
    private int pesoEspada;
    private int danoEspada;

    public Espada(int idEspada, String nombreEspada, int pesoEspada, int danoEspada) {
        this.idEspada = idEspada;
        this.nombreEspada = nombreEspada;
        this.pesoEspada = pesoEspada;
        this.danoEspada = danoEspada;
    }

    public int getIdEspada() {
        return idEspada;
    }

    public String getNombreEspada() {
        return nombreEspada;
    }

    public int getPesoEspada() {
        return pesoEspada;
    }

    public int getDanoEspada() {
        return danoEspada;
    }
}
