package sct.contornos.gestion;

public class Modulo {
    private String codigo;
    private String nombre;
    private String descripcion;
    private int horas;
    private int sesiones;
    private Ciclo ciclo;
    
    public Modulo() {
    }
    public Modulo(String codigo, String nombre, String descripcion, int horas, int sesiones, Ciclo ciclo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.horas = horas;
        this.sesiones = sesiones;
        this.ciclo = ciclo;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }
    public int getSesiones() {
        return sesiones;
    }
    public void setSesiones(int sesiones) {
        this.sesiones = sesiones;
    }
    public Ciclo getCiclo() {
        return ciclo;
    }
    public void setCiclo(Ciclo ciclo) {
        this.ciclo = ciclo;
    }
    @Override
    public String toString() {
        return "Modulo [codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", horas=" + horas
                + ", sesiones=" + sesiones + ", ciclo=" + ciclo + "]";
    }
    public int sesionesAP(){
        return sesionesPD()/10*6;
    }
    public int sesionesPD(){
        return this.sesiones/10;
    }
    



}
