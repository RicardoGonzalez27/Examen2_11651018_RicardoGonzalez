/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_11651018;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Richard
 */
public class Usuario implements Serializable{
    private int id;
    private String contra;
    private String primer;
    private String segundo;
    private String apellido_uno;
    private String apellido_dos;
    private int nacimiento;
    private int afilicion;
    private ArrayList <Transaccion> trasacciones = new ArrayList();

    public Usuario() {
    }

    public Usuario(int id, String contra, String primer, String segundo, String apellido_uno, String apellido_dos, int nacimiento, int afilicion) {
        this.id = id;
        this.contra = contra;
        this.primer = primer;
        this.segundo = segundo;
        this.apellido_uno = apellido_uno;
        this.apellido_dos = apellido_dos;
        this.nacimiento = nacimiento;
        this.afilicion = afilicion;
    }
    
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getPrimer() {
        return primer;
    }

    public void setPrimer(String primer) {
        this.primer = primer;
    }

    public String getSegundo() {
        return segundo;
    }

    public void setSegundo(String segundo) {
        this.segundo = segundo;
    }

    public String getApellido_uno() {
        return apellido_uno;
    }

    public void setApellido_uno(String apellido_uno) {
        this.apellido_uno = apellido_uno;
    }

    public String getApellido_dos() {
        return apellido_dos;
    }

    public void setApellido_dos(String apellido_dos) {
        this.apellido_dos = apellido_dos;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getAfilicion() {
        return afilicion;
    }

    public void setAfilicion(int afilicion) {
        this.afilicion = afilicion;
    }

    public ArrayList<Transaccion> getTrasacciones() {
        return trasacciones;
    }

    public void setTrasacciones(ArrayList<Transaccion> trasacciones) {
        this.trasacciones = trasacciones;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", contra=" + contra + ", primer=" + primer + ", segundo=" + segundo + ", apellido_uno=" + apellido_uno + ", apellido_dos=" + apellido_dos + ", nacimiento=" + nacimiento + ", afilicion=" + afilicion + ", trasacciones=" + trasacciones + '}';
    }
    
    
}
