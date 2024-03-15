/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema10;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author alumno
 */
public class listasBidimensionales {
    
    public static void main(String[] args) {
        
        //Me creo el Array en 2 Dimensiones
        
        ArrayList<ArrayList<Integer>> lista01 = new ArrayList<>();
        System.out.println("Lista 2D: "+lista01);
        
        int numberOfList = 3;
        for (int i = 0; i < numberOfList; i++){
        lista01.add(new ArrayList<>());
      }
        
        System.out.println("Lista 2D Inicializada: "+lista01);
    
        //Añado Elementos en la Lista. El primero a la primera Lista
        
        lista01.get(0).add(5);
        lista01.get(1).add(2);
        lista01.get(2).add(4);
        lista01.get(2).add(8);
        
        System.out.println("Lista 2D: "+ lista01);
    
    }
    
    
}
