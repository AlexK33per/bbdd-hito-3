package game.model;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;

public class PortaE {
    private String NombreP;
    private String idEspada;

    public PortaE(String nombreP, String idEspada) {
        NombreP = nombreP;
        this.idEspada = idEspada;
    }

    public String getNombreP() {
        return NombreP;
    }

    public void setNombreP(String nombreP) {
        NombreP = nombreP;
    }

    public String getIdEspada() {
        return idEspada;
    }

    public void setIdEspada(String idEspada) {
        this.idEspada = idEspada;
    }
}
