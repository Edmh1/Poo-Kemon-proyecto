/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.pml.appPookemon.persistencia;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import main.java.com.pml.appPookemon.datos.registro.model.Organizador;

/**
 *
 * @author Vladimir
 */
public class Serializable {
    
    public void guardar(Organizador o) throws FileNotFoundException, IOException{
        FileOutputStream file = new FileOutputStream("Admin.obj");
        ObjectOutputStream salida = new ObjectOutputStream(file);
        salida.writeObject(o);
        salida.close();
        file.close();
        
        
    }
    
    public Organizador recuperar(String o) throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream file = new FileInputStream(o);
        ObjectInputStream entrada = new ObjectInputStream(file);
        Organizador ob= (Organizador) entrada.readObject();
        entrada.close();
        file.close();
        return ob;
        
    }
}
