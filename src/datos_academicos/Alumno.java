package datos_academicos;

import datospersoais.DatosPersoais;

public class Alumno {
    
    public static int referencia;
    private float notTeorica, notPractica, boletins;
    private DatosPersoais personal;

    public Alumno() {
    }

    public Alumno(float notTeorica, float notPractica, float boletins, DatosPersoais personal) {
        this.notTeorica = notTeorica;
        this.notPractica = notPractica;
        this.boletins = boletins;
        this.personal = personal;
    }

    public float getNotTeorica() {
        return notTeorica;
    }

    public void setNotTeorica(float notTeorica) {
        this.notTeorica = notTeorica;
    }

    public float getNotPractica() {
        return notPractica;
    }

    public void setNotPractica(float notPractica) {
        this.notPractica = notPractica;
    }

    public float getBoletins() {
        return boletins;
    }

    public void setBoletins(float boletins) {
        this.boletins = boletins;
    }

    public DatosPersoais getPersonal() {
        return personal;
    }

    public void setPersonal(DatosPersoais personal) {
        this.personal = personal;
    }
    
    @Override
    public String toString() {
        return "Alumno{" + "notTeorica=" + notTeorica + ", notPractica=" + notPractica + ", boletins=" + boletins + "nota media= " + notaMedia() + "\n personal=" + personal + '}';
    }
    public  float notaMedia(){
        return ( notTeorica*0.40f + notPractica * 0.40f + boletins*0.2f);
    }
    
}
