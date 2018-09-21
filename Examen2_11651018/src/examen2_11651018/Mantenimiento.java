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
public class Mantenimiento extends Usuario implements Serializable{
    ArrayList <ATM> atms;

    public Mantenimiento() {
    }

    
    
    public Mantenimiento(ArrayList<ATM> atms, int id, String contra, String primer, String segundo, String apellido_uno, String apellido_dos, int nacimiento, int afilicion, ArrayList<Transaccion> trasacciones) {
        super(id, contra, primer, segundo, apellido_uno, apellido_dos, nacimiento, afilicion, trasacciones);
        this.atms = atms;
    }

    public ArrayList<ATM> getAtms() {
        return atms;
    }

    public void setAtms(ArrayList<ATM> atms) {
        this.atms = atms;
    }

    @Override
    public String toString() {
        return "Mantenimiento{" + "atms=" + atms + '}';
    }
    
    
}
