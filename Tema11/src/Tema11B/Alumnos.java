/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema11B;

/**
 *
 * @author alumno
 */
public class Alumnos {
    
    private String nombre;
    private String apellidos;
    private int numero;
    
    //Metodos constructores
    
    public Alumnos(){
        
    }
    
    
    public Alumnos (String nombre, String apellidos, int numero){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numero = numero;
    }
    
    
    //Metodo get 
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellidos(){
        return apellidos;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public void setNombre(String par){
        this.nombre = nombre;
        
    }
    
    public void setApellido(String par){
        this.apellidos = apellidos;
    }
    
    public void setNumero(int parseInt){
        this.numero = numero;
    }
    
    @Override
    
    public String toString(){
        return "Nombre: " + nombre + "Apellidos: " + apellidos + "numero: " + numero;
    }
}
