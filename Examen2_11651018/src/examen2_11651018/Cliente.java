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
    ArrayList <Cuenta> cuentas = new ArrayList();

    public Cliente() {
    }

    public Cliente(int id, String contra, String primer, String segundo, String apellido_uno, String apellido_dos, int nacimiento, int afilicion) {
        super(id, contra, primer, segundo, apellido_uno, apellido_dos, nacimiento, afilicion);
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
