
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author miguel.galera
 */
public class Ejercicio0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Dime una cadena: ");
        String cadena=teclado.nextLine();
    
//        FORMA 1: FOR
        
        for (int i=0; i<cadena.length(); i++){
            System.out.println(cadena.charAt(i));
        }
        //FORMA 2: SUBSTRING
        
        for (int i=0; i<cadena.length(); i++){
            System.out.println(cadena.substring(i, i+1));
        }
        
        
        
        
        
        
    }
    
}
