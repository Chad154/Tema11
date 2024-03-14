/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Imperador;

import java.util.ArrayList;
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
        
        
        //Crear el objeto a partir de la clase concreta
        //A la izquieda el tipo de ArrayList
        //Hay que importar El Java.util.ArrayList
        
        ArrayList<Integer> lista02 = new ArrayList<>();
        
        //Ver tipo de lista con get.Class
        System.out.println("Tipo de lista01" + lista01DAM1.getClass());
        System.out.println("Tipo de lista02" + lista02.getClass());
        
        //Definir el tamaño inical de la Lista
        //
        
        ArrayList<String> lista03 = new ArrayList<>(2);
        lista03.add("Sara");
        lista03.add("Juan");
        System.out.print(lista03 + ",");
        System.out.println();
        
        lista03.add("Elena");
        System.out.println(lista03 + ",");
        System.out.println();
        
        //Para actualizar elementos ya metidos con .set(index es el numero de elemento y elemento es la modificacion
        
        lista03.set(0, "Sara Gonzalez");
        lista03.set(1,"Juan Torres");
        lista03.set(2,"Elena Sanchez");
        lista03.add("David");
        
        System.out.println("Lista03 modificada"+lista03 + ",");
        // Con el .size nos muestra la longitud de la lista
        System.out.println("Lista: "+ lista03.size());
        System.out.println();
        
        //Como imprimir un elemento especifico .get(Numero del elemento)
        
        System.out.println("Elemento 2 de la lista: "+lista03.get(1));
        
        //Eliminar un elemento de la lista con .remove
        
        lista03.remove(1);
        System.out.println("Lista con un elemento menos: "+lista03+",");
        // Con el .size nos muestra la longitud de la lista
        System.out.println("Lista: "+ lista03.size());
        
        //Elimina todos los Elementos que contengan David
        
        lista03.remove("David");
        System.out.println("Lista con el elemento David eliminado" + lista03 + ",");
        // Con el .size nos muestra la longitud de la lista
        
        System.out.println("Lista: "+ lista03.size());
        
        //Eliminamos todos los elementos de la lista
        
        lista03.removeAll(lista03);
        
        System.out.println("Lista: "+lista03);
        // Con el .size nos muestra la longitud de la lista
        System.out.println("Lista: "+ lista03.size());
    }
    
}
