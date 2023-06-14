package modelo;

public class Recolecciones extends Envio{

    private int id;
    private String numeroG;
    private String fechaRecoleccion;
    private String horaRecoleccion;
    private String fechaPaqueteListo;
    private String horaPaqueteListo;

    public Recolecciones(String fechaPaqueteListo, String horaPaqueteListo, String numeroGuia, String sucursalOrigen, String sucursalDestino, double peso, double alto, double largo, double ancho, String user, String status, int id, String numeroG, String fechaRecoleccion, String horaRecoleccion) {
        super(numeroGuia, sucursalOrigen, sucursalDestino, peso, alto, largo, ancho, user, status);
        this.id = id;
        this.numeroG = numeroG;
        this.fechaRecoleccion = fechaRecoleccion;
        this.horaRecoleccion = horaRecoleccion;
        this.fechaPaqueteListo = fechaPaqueteListo;
        this.horaPaqueteListo = horaPaqueteListo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
