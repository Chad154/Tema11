/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema10;

/**
 *
 * @author alumno
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Tema10 {
    
    //Para añadir datos en Collection se utiliza .add
    
    static Collection rellenar (Collection e){
        e.add("perro");
        e.add("gato");
        e.add("perro");
        
        return e;
    }
    
    //Para añadir datos en Map se utiliza .put
    
    static Map rellenar (Map m){
    
        m.put("perro", "San Bernardo");
        m.put("gato", "Montes");
        m.put("perro", "Presa Canario");
        System.out.println(m.size());
        
        return m;
    }
    
    public static void main(String[] args){
        
        //Se añade java.util.ArrayList
        System.out.println("ArrayList"+rellenar(new ArrayList())); //Devuelve todos los elementos por orden de Insercion
        //Se añade java.util.HashSet
        System.out.println("HashSet"+rellenar(new HashSet())); //Devuelve Los elementos sin repetir
        //Se añade java.util.HashMap
        System.out.println("HashMap"+rellenar(new HashMap())); //Devuelve el Map Empezando por el final sin repetir
        
        // Fin Main
    }
    
}
