package game.model;

public class Arma {
    private String nombreA;
    private int peso = 30;
    private int danio = 50;
    private long idArma;
    private String nombreR;

    public Arma(String nombreA, int peso, int danio, long idArma, String nombreR) {
        this.nombreA = nombreA;
        this.peso = peso;
        this.danio = danio;
        this.idArma = idArma;
        this.nombreR = nombreR;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nom) {
        nombreA = nom;
    }

    public String getNombreR() {
        return nombreR;
    }

    public void setNombreR(String nom) {
        nombreR = nom;
    }
}
