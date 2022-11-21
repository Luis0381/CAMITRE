package Partidos;

public class ModeloPartidos {
    private Integer id_partido;
    private String nombre_torneo;
    private String rival;
    private String condicion;
    private Integer goles_r;
    private Integer goles_m;
    private String instancia;
    private String estadio;

    public Integer getId_partido() {
        return id_partido;
    }

    public void setId_partido(Integer id_partido) {
        this.id_partido = id_partido;
    }

    public String getNombre_torneo() {
        return nombre_torneo;
    }

    public void setNombre_torneo(String nombre_torneo) {
        this.nombre_torneo = nombre_torneo;
    }

    public String getRival() {
        return rival;
    }

    public void setRival(String rival) {
        this.rival = rival;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public Integer getGoles_r() {
        return goles_r;
    }

    public void setGoles_r(Integer goles_r) {
        this.goles_r = goles_r;
    }

    public Integer getGoles_m() {
        return goles_m;
    }

    public void setGoles_m(Integer goles_m) {
        this.goles_m = goles_m;
    }

    public String getInstancia() {
        return instancia;
    }

    public void setInstancia(String instancia) {
        this.instancia = instancia;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }
    
    


}