package sct.contornos.persona;

import java.util.Date;
/**
 * Clase Profesor
 * @author Adriam paz
 */
public class Profesor extends Persona{
    private String especialidad;
    private String cuerpo;
    private boolean sustituto;
    private Date fechaOposicion;

    public Profesor(String dni, String nombre, String apellido1, String apellido2, String correo, int movil,
            Date fecNacimiento, String especialidad, String cuerpo, boolean sustituto, Date fechaOposicion) {
        super(dni, nombre, apellido1, apellido2, correo, movil, fecNacimiento);
        this.especialidad = especialidad;
        this.cuerpo = cuerpo;
        this.sustituto = sustituto;
        this.fechaOposicion = fechaOposicion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public boolean isSustituto() {
        return sustituto;
    }

    public void setSustituto(boolean sustituto) {
        this.sustituto = sustituto;
    }

    public Date getFechaOposicion() {
        return fechaOposicion;
    }

    public void setFechaOposicion(Date fechaOposicion) {
        this.fechaOposicion = fechaOposicion;
    }

    @Override
    public String toString() {
        return this.dni+" "+this.apellido1+" "+this.nombre+" "+this.getEspecialidad();

    }
    
    
}
