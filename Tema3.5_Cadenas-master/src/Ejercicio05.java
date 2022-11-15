/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //PARTE 1
        //LA FUNCIÓN SUBSTRING TE EXTRAE UNA SUBCADENA DE UNA CADENA CON LA POSICIÓN DE CARACTERES
        
        System.out.println("PARTE 1 - FUNCIÓN SUBSTRING 1");
        System.out.println("----------------------------");
        
        String cadena=" me llamo Pepe";
        
        System.out.println("CADENA CON LOS ESPACIOS: "+cadena);
        
        String cadenasinesp=cadena.substring(0);    
        System.out.println("CADENA SIN LOS ESPACIOS: "+cadena.substring(1));
        
        //PARTE 2
        
        System.out.println("PARTE 2 - FUNCION SUBSTRING 2");
        System.out.println("----------------------------");
        
        String cadena2=" hola don Pepito ";
        
        System.out.println("CADENA 2 CON LOS ESPACIOS: "+cadena2);
        System.out.println("CADENA 2 SIN LOS ESPACIOS: "+cadena2.substring(1,16));
        
        //PARTE 3
        //LA FUNCIÓN TRI TE ELIMINA LOS ESPACIOS EN BLANCO A CADA EXTREMO
        
        System.out.println("PARTE 3 - FUNCIÓN TRIM");
        System.out.println("----------------------");
        
        String cadena3=" haberlo dicho antes ";
        
        System.out.println("CADENA 3 CON LOS ESPACIOS: "+cadena3);
        System.out.println("CADENA 3 SIN LOS ESPACIOS: "+cadena3.trim());
        
        
        
        
        
        
        
        
        
    }
    
}
