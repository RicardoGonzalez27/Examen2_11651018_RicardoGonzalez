/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_11651018;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Richard
 */
public class administraratm {
    
    ArrayList <ATM> ATMs = new ArrayList();
    private File archivo;

    public administraratm(String path) {
        archivo = new File(path);
    }

    public ArrayList<ATM> getATMs() {
        return ATMs;
    }

    public void setATMs(ArrayList<ATM> ATMs) {
        this.ATMs = ATMs;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "administraratm{" + "ATMs=" + ATMs;
    }
    
    
    public void setATM(ATM a) {
        this.ATMs.add(a);
    }
    
    public void cargarArchivoATM() {
        try {
            ATMs = new ArrayList();
            ATM temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (ATM) objeto.readObject()) != null) {
                        ATMs.add(temp);
                        System.out.println(temp);
                    }
                } catch (Exception e) {

                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void escribirArchivoATM() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (ATM t : ATMs) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}
