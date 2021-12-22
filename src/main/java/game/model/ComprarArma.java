package game.model;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;

public class ComprarArma {
    private long IdArma;
    private String NombreP;
    private boolean Porta;
    private String Fecha;

    public ComprarArma(long IdArma, String NombreP, boolean Porta, String Fecha) {
        this.IdArma = IdArma;
        this.NombreP = NombreP;
        this.Porta = Porta;
        this.Fecha = Fecha;
    }



    public long getIdArma() {
        return this.IdArma;
    }

    public void setIdArma(long IdArma) {
        this.IdArma = IdArma;
    }

    public String getNombreP() {
        return this.NombreP;
    }

    public void setNombreP(String NombreP) {
        this.NombreP = NombreP;
    }

    public boolean isPorta() {
        return this.Porta;
    }

    public void setPorta(boolean Porta) {
        this.Porta = Porta;
    }

    public String getFecha() {
        return this.Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

}
