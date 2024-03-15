/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema10;

/**
 *
 * @author alumno
 */

import java.util.Map;

public class Mapa01 {
    
    public static void main(String[] args) {
        
        //Hay que importar java.util.Map 
        //La K se refiere al numero de elemento y v al elemento
        
        Map<Integer,String> mapaDAM1 = Map.of(1, "Teclado", 2, "Monitor",3,"CPU");
        
        mapaDAM1.forEach((clave,valor) ->System.out.println((clave +":"+valor)) );
        
    }
    
}
