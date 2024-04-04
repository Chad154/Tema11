/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema11B;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Test {
    
    public static void main(String[] args) {
        
        ArrayList<Alumnos> alumnoDAM = new ArrayList<Alumnos>();
        
        //Instanciar el fichero
        
        File fichero = new File("Alumno2.txt");
        
        Scanner s = null;
        
        try{
            System.out.println("Leer el Contenido del fichero");
            s = new Scanner(fichero);
            //Voy obteniendo los datos de cada alumno
            while(s.hasNextLine()){
                String registro = s.nextLine(); //Obtiene una fila de un alumno
                String [] cortarString = registro.split("::");
               
                //Objeto clase alumno con sus atributos
                Alumnos alumno = new Alumnos();
                alumno.setNumero(Integer.parseInt(cortarString[0]));
                alumno.setNombre(cortarString[1]);
                alumno.setApellido(cortarString[2]);
                
                //añadir el alumno a la lista
                
                alumnoDAM.add(alumno);
                
            }//Fin WHILE
        }catch(FileNotFoundException e0){
            e0.printStackTrace();
        }catch(Exception e1){
            System.out.println("Error excepcional");
            e1.printStackTrace();
        }finally{
            try{
                if(s!=null)
                    s.close();
            }catch(Exception e2){
                System.out.println("ERROR AL CERRAR FICHERO");
                e2.printStackTrace();
            }//FIN 2º TRY-CATCH
        }//FIN FiNALLY
        
        
        //Imprimir el fichero
        System.out.println("ALUMNOS de 1º DAM: "+ alumnoDAM.size());
        Iterator<Alumnos> itAlumnos = alumnoDAM.iterator();
        System.out.println("NUMERO"+"NOMBRE      "+"APELLIDOS");
        System.out.println("-----------------------------");
        
        while(itAlumnos.hasNext()){
            Alumnos alumnos2=itAlumnos.next();
            System.out.println(" "+alumnos2.getNumero()+"-   "+alumnos2.getNombre()+"   "+alumnos2.getApellidos());
        }
    }
    
}
