/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema11;

import java.util.ArrayList;
import java.util.Iterator;

//Librarerias importantes
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author alumno
 */

public class Tema11 {
    
    public static void main(String[] args) {
        
        //Definicon del array list de tipo String
        ArrayList<String> alumnos = new ArrayList<String>();
        
        //Instanciar el fichero donde se encuentran los datos
        
        File fichero = new File("Alumnos.txt");
        Scanner s = null;
        
        try{
            
        System.out.println("LEYENDO CONTENIDO DEL FICHERO");
        s = new Scanner(fichero);
        //Obtener los datos del fichero
        while(s.hasNextLine()){
         String linea = s.nextLine();
         alumnos.add(linea);
         
        }//Fin While
        
        }catch(FileNotFoundException e0){
            e0.printStackTrace();
        }catch(Exception e1){
            e1.printStackTrace();
        }finally{
            s.close();
        }
        //Fin del TRY 1º
        System.out.println("ALUMNOS DEL CURSO 1º DAM:" + alumnos.size() );
        Iterator<String> italumnos = alumnos.iterator();
        while(italumnos.hasNext() ){
            String alumnosDam = italumnos.next();
            System.out.println(alumnosDam);
        }
    
    
    }//Fin del Main
}
