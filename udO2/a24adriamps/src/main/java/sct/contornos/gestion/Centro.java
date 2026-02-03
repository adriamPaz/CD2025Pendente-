package sct.contornos.gestion;

public class Centro {
    private int codigo;
    private String nombre;
    private String localidad;
    private String calle;
    private String numero;
    private int codigoPostal;
    
    public Centro() {
    }
    public Centro(int codigo, String nombre, String localidad, String calle, String numero, int codigoPostal) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.localidad = localidad;
        this.calle = calle;
        this.numero = numero;
        this.codigoPostal = codigoPostal;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getLocalidad() {
        return localidad;
    }
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public int getCodigoPostal() {
        return codigoPostal;
    }
    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getDireccion(){
        String direccion = this.calle+" "+this.numero+" ,"+this.codigoPostal+" "+this.localidad;
        return direccion;
    }
    
    @Override
    public String toString() {
        return this.nombre + getDireccion();
    }
}
