package game.model;

public class Personaje {
    private String nombreP;
    private int vida;
    private int totalOro;
    private int nivel;
    private String daga;
    private int mana;
    private String apariencia;
    private int cargaT;
    private int manaMax;
    private int vidaMax;
    private String nombreR;

    public Personaje(String nombreP, String apariencia, String nombreR){
        this.nombreP = nombreP;
        this.vida = 500;
        this.totalOro = 0;
        this.nivel = 0;
        this.daga = "basica";
        this.mana = 0;
        this.cargaT = 70;
        this.manaMax = 300;
        this.vidaMax = 2000;
        this.apariencia = apariencia;
        this.nombreR = nombreR;
    }

    public Guerrero(){
        this.nombreP = " ";
        this.vida = 500;
        this.totalOro = 0;
        this.nivel = 0;
        this.daga = "basica";
        this.mana = 0;
        this.cargaT = 70;
        this.manaMax = 300;
        this.vidaMax = 2000;
        this.apariencia = " ";
    
    }

    public String getNombreP(){
        return this.nombreP;
    }

    public int getVida(){
        return this.vida;
    }

    public int getTotalOro(){
        return this.totalOro;
    }

    public int getNivel(){
        return this.nivel;
    }

    public String getDaga(){
        return this.daga;
    }

    public int getMana(){
        return this.mana;
    }

    public int getCargaT(){
        return this.cargaT;
    }

    public int getManaMax(){
        return this.manaMax;
    }

    public int getVidaMax(){
        return this.vidaMax;
    }

    public String getApariencia(){
        return this.apariencia;
    }
}

