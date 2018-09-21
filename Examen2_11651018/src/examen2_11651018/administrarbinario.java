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
public class administrarbinario {

    /**
     *
     * @author Richard
     */
    ArrayList <Usuario> usuarios = new ArrayList();
    ArrayList <ATM> ATMs = new ArrayList();
    private File archivo;

    public administrarbinario(String path) {
        archivo = new File(path);
    }

    public ArrayList<ATM> getATMs() {
        return ATMs;
    }

    public void setATMs(ArrayList<ATM> ATMs) {
        this.ATMs = ATMs;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "administrarusuarios{" + "usuarios=" + usuarios + ", archivo=" + archivo + '}';
    }

    public void setUsuarios(Usuario u) {
        this.usuarios.add(u);
    }
    
    public void setATM(ATM a) {
        this.ATMs.add(a);
    }

    public void cargarArchivoUsuario() {
        try {
            usuarios = new ArrayList();
            Usuario temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Usuario) objeto.readObject()) != null) {
                        usuarios.add(temp);
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

    public void escribirArchivoUsuario() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Usuario t : usuarios) {
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
