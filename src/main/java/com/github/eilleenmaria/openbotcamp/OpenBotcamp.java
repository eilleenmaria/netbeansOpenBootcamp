/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.github.eilleenmaria.openbotcamp;

/**
 *
 * @author GARCES-GUTIERREZ
 */
public class OpenBotcamp {

    public static void main(String[] args) {
     Persona  p1= new Persona();
     p1.setNombre("Pedro");
     p1.setEdad(12);
     p1.setTelefono(3546789);
     
     Persona p2 = new Persona(14, "Luisa" , 34567856);
     
     System.out.println("Mi nombre es " + p1.getNombre()+ " tengo " + p1.getEdad() + " años y mi numero telefonico es " + p1.getTelefono());
     System.out.println("Mi nombre es " + p2.getNombre()+ " tengo " + p2.getEdad() + " años y mi numero telefonico es " + p2.getTelefono());
     
    }
}
