/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author miguel.galera
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String cadena="hombres y mujeres tenemos los mismos derechos";
        
        System.out.println("hombres y mujeres tenemos los mismos derechos");
        
        String mujeres="mujeres";
        
        if(cadena.indexOf("mujeres")!=-1){
            System.out.println("La frase sí contiene "+mujeres); 
        }
        
        if(cadena.contains("mujeres")){
            System.out.println("La frase sí contiene "+mujeres);
        }        
        
        
        
        
        
        
        
    }
    
}
