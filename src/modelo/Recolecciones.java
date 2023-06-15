package modelo;

public class Recolecciones{

    private String numeroGuia;
    private String fechaRecoleccion;
    private String horaRecoleccion;
    private String fechaPaqueteListo;
    private String horaPaqueteListo;

    public Recolecciones(String numeroGuia, String fechaRecoleccion, String horaRecoleccion, String fechaPaqueteListo, String horaPaqueteListo) {
        this.numeroGuia = numeroGuia;
        this.fechaRecoleccion = fechaRecoleccion;
        this.horaRecoleccion = horaRecoleccion;
        this.fechaPaqueteListo = fechaPaqueteListo;
        this.horaPaqueteListo = horaPaqueteListo;
    }

    public String getNumeroGuia() {
        return numeroGuia;
    }

    public void setNumeroGuia(String numeroGuia) {
        this.numeroGuia = numeroGuia;
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
