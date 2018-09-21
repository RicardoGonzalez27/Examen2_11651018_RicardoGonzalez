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
public class Cliente extends Usuario implements Serializable{
    ArrayList <Cuenta> cuentas;

    public Cliente() {
    }

    public Cliente(ArrayList<Cuenta> cuentas, int id, String contra, String primer, String segundo, String apellido_uno, String apellido_dos, int nacimiento, int afilicion, ArrayList<Transaccion> trasacciones) {
        super(id, contra, primer, segundo, apellido_uno, apellido_dos, nacimiento, afilicion, trasacciones);
        this.cuentas = cuentas;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cuentas=" + cuentas + '}';
    }
}
