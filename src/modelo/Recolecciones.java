package modelo;

public class Recolecciones{

    private String numeroG;
    private String fechaRecoleccion;
    private String horaRecoleccion;
    private String fechaPaqueteListo;
    private String horaPaqueteListo;

    public Recolecciones(String numeroG, String fechaRecoleccion, String horaRecoleccion, String fechaPaqueteListo, String horaPaqueteListo) {
        this.numeroG = numeroG;
        this.fechaRecoleccion = fechaRecoleccion;
        this.horaRecoleccion = horaRecoleccion;
        this.fechaPaqueteListo = fechaPaqueteListo;
        this.horaPaqueteListo = horaPaqueteListo;
    }

    public String getNumeroG() {
        return numeroG;
    }

    public void setNumeroG(String numeroGuia) {
        this.numeroG = numeroGuia;
    }

    public String getFechaRecoleccion() {
        return fechaRecoleccion;
    }

    public void setFechaRecoleccion(String fechaRecoleccion) {
        this.fechaRecoleccion = fechaRecoleccion;
    }

    public String getHoraRecoleccion() {
        return horaRecoleccion;
    }

    public void setHoraRecoleccion(String horaRecoleccion) {
        this.horaRecoleccion = horaRecoleccion;
    }

    public String getFechaPaqueteListo() {
        return fechaPaqueteListo;
    }

    public void setFechaPaqueteListo(String fechaPaqueteListo) {
        this.fechaPaqueteListo = fechaPaqueteListo;
    }

    public String getHoraPaqueteListo() {
        return horaPaqueteListo;
    }

    public void setHoraPaqueteListo(String horaPaqueteListo) {
        this.horaPaqueteListo = horaPaqueteListo;
    }
    
    
}
