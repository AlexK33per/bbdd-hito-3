package game.model;

public class Hacha {
    private int idHacha;
    private String nombreHacha;
    private int pesoHacha;
    private int danoHacha;

    public Hacha(int idHacha, String nombreHacha, int pesoHacha, int danoHacha) {
        this.idHacha = idHacha;
        this.nombreHacha = nombreHacha;
        this.pesoHacha = pesoHacha;
        this.danoHacha = danoHacha;
    }

    public int getIdHacha() {
        return idHacha;
    }

    public String getNombreHacha() {
        return nombreHacha;
    }

    public int getPesoHacha() {
        return pesoHacha;
    }

    public int getDanoHacha() {
        return danoHacha;
    }
}
