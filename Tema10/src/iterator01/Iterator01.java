/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iterator01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

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
        //Se puede hacer tambien con Lista03.clear()
        
        lista03.removeAll(lista03);
        
        System.out.println("Lista: "+lista03);
        // Con el .size nos muestra la longitud de la lista
        System.out.println("Lista: "+ lista03.size());
       
       //Metodo contain
       
       boolean contiene = false;
       contiene = lista03.contains("Sara Gonzalez");
       //Sale false por que esta puesto el remove all si lo quitamos funciona
       System.out.println("Valor booleano de contiene "+ contiene);
       
       //Ordenar Collections
       //Hay que importar la clase Collection
       
       Collections.sort(lista03);
       System.out.println("Elementos de la Lista03 ordenado"+ lista03);
       
       ArrayList<Integer>lista04 = new ArrayList<>();
       
       lista04.add(12);
       lista04.add(5);
       lista04.add(7);
       lista04.add(10);
       lista04.add(9);
       
        System.out.println("Numeros sin ordenar: "+ lista04);
        Collections.sort(lista04, Integer::compareTo);
        System.out.println("Numeros ordenados: "+ lista04);
        
        //Ordenar de manera invertida
        //Hay que importar la clase Comparator
        
        Comparator<Integer> comparador = Collections.reverseOrder();
        Collections.sort(lista04,comparador);
        System.out.println("Lista invertida: "+ lista04);
        
        //Ejemplo de Ordenar
        
        //Creamos un ArrayList
        ArrayList<Integer>lista04B = new ArrayList<>(List.of(6,8,12,1,15));
        
        System.out.println("Numeros sin ordenar: "+ lista04B);
        
        //Utilizamos .sort para ordenarlo de manera ascedente
        Collections.sort(lista04B, Integer::compareTo);
        System.out.println("Numero ordenados de menor a mayor "+ lista04B);
        
        //Utilizamos .sort con el comparador hecho anteriormente para ordenarlo de manera descedente
        Collections.sort(lista04B, comparador);
        System.out.println("Numeros ordenados de mayor a menor "+ lista04B);
        
        //Copiar Valores en una lista
        
        List<String> lista5 = Collections.nCopies(5, "Hola");
        System.out.println("Lista repetida "+ lista5);
        
        
        
        
     }
     
}
