/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema10;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author alumno
 */
public class CollecionProvinciaCapitales {
    
      public static void main(String[] args) {
          
          
           Map<String,String> mapaComunidadesAut = Map.of("Comunidad De Madrid", "Madrid", "Comunidad Valenciana", "Valencia","Andalucia","Sevilla");
           mapaComunidadesAut.forEach((clave,valor) ->System.out.println((clave +":"+valor)) );
      
      
      }
    
}
