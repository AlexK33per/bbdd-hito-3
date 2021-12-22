package game.model;

public class Cataloga {
   private String nombreF;
   private String idArma;

    public Cataloga(String string, String string1) {
        nombreF = string;
        idArma = string1;
    }

    public String getNombre() {
        return nombreF;
    }

    public void setNombre(String string) {
        nombreF = string;
    }
}