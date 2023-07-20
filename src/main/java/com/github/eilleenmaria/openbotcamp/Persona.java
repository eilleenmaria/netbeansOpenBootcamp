/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.eilleenmaria.openbotcamp;

/**
 *
 * @author GARCES-GUTIERREZ
 */
public class Persona {
    private int edad;
    private String nombre;
    private int telefono;
    
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
     public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
     public int getTelefono(){
        return telefono;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    
    public Persona(int edad, String nombre, int telefono){
        super();
        this.edad =  edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    public Persona(){}
    
}
