
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("CADENA CON ESPACIOS: ");
        String cadenaconesp=teclado.nextLine();
        
        int espacios=0;
        
        for(int i=0;i<cadenaconesp.length();i++)
            if(cadenaconesp.charAt(i)==espacios){
                System.out.println();
                espacios++;
            }
        
        
        
        
        
        
        
        
        
    }
    
}
