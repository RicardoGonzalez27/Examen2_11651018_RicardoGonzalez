/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_11651018;

import java.io.Serializable;

/**
 *
 * @author Richard
 */
public class Cuenta{
    private int NumCuenta;
    private int saldo;
    private int id_de_usuario;

    public Cuenta() {
    }

    public Cuenta(int NumCuenta, int saldo, int id_de_usuario) {
        this.NumCuenta = NumCuenta;
        this.saldo = saldo;
        this.id_de_usuario = id_de_usuario;
    }
    
    

    public int getNumCuenta() {
        return NumCuenta;
    }

    public void setNumCuenta(int NumCuenta) {
        this.NumCuenta = NumCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getId_de_usuario() {
        return id_de_usuario;
    }

    public void setId_de_usuario(int id_de_usuario) {
        this.id_de_usuario = id_de_usuario;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "NumCuenta=" + NumCuenta + ", saldo=" + saldo + ", id_de_usuario=" + id_de_usuario + '}';
    }
    
    
}
