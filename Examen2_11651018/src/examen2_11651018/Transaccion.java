/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_11651018;

/**
 *
 * @author Richard
 */
public class Transaccion {
    
    private String descripcion;
    private String fecha;
    private String usuario;

    public Transaccion() {
    }

    public Transaccion(String descripcion, String fecha, String usuario) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Transaccion{" + "descripcion=" + descripcion + ", fecha=" + fecha + ", usuario=" + usuario + '}';
    }
    
    
    
}
