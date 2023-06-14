package modelo;

public class ListaCostos {

    private String nombre;
    private  float areaRemota;
    private float seguro;
    private float paqueteFragil;
    private float excesoPeso;
    private  float sobreDimension;

    public ListaCostos(String nombre, float areaRemota, float seguro, float paqueteFragil, float excesoPeso, float sobreDimension) {
        this.nombre = nombre;
        this.areaRemota = areaRemota;
        this.seguro = seguro;
        this.paqueteFragil = paqueteFragil;
        this.excesoPeso = excesoPeso;
        this.sobreDimension = sobreDimension;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getAreaRemota() {
        return areaRemota;
    }

    public void setAreaRemota(float areaRemota) {
        this.areaRemota = areaRemota;
    }

    public float getSeguro() {
        return seguro;
    }

    public void setSeguro(float seguro) {
        this.seguro = seguro;
    }

    public float getPaqueteFragil() {
        return paqueteFragil;
    }

    public void setPaqueteFragil(float paqueteFragil) {
        this.paqueteFragil = paqueteFragil;
    }

    public float getExcesoPeso() {
        return excesoPeso;
    }

    public void setExcesoPeso(float excesoPeso) {
        this.excesoPeso = excesoPeso;
    }

    public float getSobreDimension() {
        return sobreDimension;
    }

    public void setSobreDimension(float sobreDimension) {
        this.sobreDimension = sobreDimension;
    }

    
    
}
