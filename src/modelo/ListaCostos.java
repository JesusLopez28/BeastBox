package modelo;

public class ListaCostos {

    private String nombre;
    private int areaRemota;
    private int seguro;
    private boolean paqueteFragil;
    private int excesoPeso;
    private boolean sobreDimension;

    public ListaCostos(String nombre, int areaRemota, int seguro, boolean paqueteFragil, int excesoPeso, boolean sobreDimension) {
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

    public int getAreaRemota() {
        return areaRemota;
    }

    public void setAreaRemota(int areaRemota) {
        this.areaRemota = areaRemota;
    }

    public int getSeguro() {
        return seguro;
    }

    public void setSeguro(int seguro) {
        this.seguro = seguro;
    }

    public boolean isPaqueteFragil() {
        return paqueteFragil;
    }

    public void setPaqueteFragil(boolean paqueteFragil) {
        this.paqueteFragil = paqueteFragil;
    }

    public int getExcesoPeso() {
        return excesoPeso;
    }

    public void setExcesoPeso(int excesoPeso) {
        this.excesoPeso = excesoPeso;
    }

    public boolean isSobreDimension() {
        return sobreDimension;
    }

    public void setSobreDimension(boolean sobreDimension) {
        this.sobreDimension = sobreDimension;
    }
    
    
}
