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
public class ATM {
    private String ubicacion;
    private int id;
    private int año;
    private String  mantenimiento;
    private int cien;
    private int quinientos;

    public ATM() {
    }
    
    public ATM(String ubicacion, int id, int año, String mantenimiento, int cien, int quinientos) {
        this.ubicacion = ubicacion;
        this.id = id;
        this.año = año;
        this.mantenimiento = mantenimiento;
        this.cien = cien;
        this.quinientos = quinientos;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(String mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    public int getCien() {
        return cien;
    }

    public void setCien(int cien) {
        this.cien = cien;
    }

    public int getQuinientos() {
        return quinientos;
    }

    public void setQuinientos(int quinientos) {
        this.quinientos = quinientos;
    }

    @Override
    public String toString() {
        return "ATM{" + "ubicacion=" + ubicacion + ", id=" + id + ", a\u00f1o=" + año + ", mantenimiento=" + mantenimiento + ", cien=" + cien + ", quinientos=" + quinientos + '}';
    }
    
    
}
