/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Imperador;

import java.util.List;

/**
 *
 * @author alumno
 */
public class Iterator01 {
    
    public static void main(String[] args){
        
        //Iterador en una lista
         
        //Hay que importar la biblioteca Java.util.list
        Iterable<String> lista01DAM1 = List.of("Alejandro", "David", "Lucia", "Marina");
        //Metodo de Impresion de Iterable
        lista01DAM1.forEach(System.out::println);
    }
    
}
