package game.model;

public class CatalogaH {
   private String nombreF;
   private String idHacha;

    public CatalogaH(String string, String string1) {
        nombreF = string;
        idHacha = string1;
    }

    public String getNombre() {
        return nombreF;
    }

    public void setNombre(String string) {
        nombreF = string;
    }
}