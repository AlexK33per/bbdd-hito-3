package game.model;

public class Rol {
    private int manaMax = 500;
    private int vidaMax = 300;
    private String nombreR;

    public Rol(String nombreR) {
        this.nombreR = nombreR;
    }

    public int getManaMax() {
        return this.manaMax;
    }

    public void setManaMax(int manaMax) {
        this.manaMax = manaMax;
    }

    public int getVidaMax() {
        return this.vidaMax;
    }

    public void setVidaMax(int vidaMax) {
        this.vidaMax = vidaMax;
    }

    public String getNombreR() {
        return this.nombreR;
    }

    public void setNombreR(String nombreR) {
        this.nombreR = nombreR;
    }
}
