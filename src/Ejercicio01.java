
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author miguel.galera
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in); 
        
        System.out.println("Dime una cadena: ");
        String cadena=teclado.nextLine();
        
        System.out.println("Dime un caracter: ");
        String aux=teclado.nextLine();
        char caracter=aux.charAt(0);
        
        int apariciones=0;
        
            for(int i=0;i<cadena.length();i++){
                if(cadena.charAt(i)==caracter){
                apariciones++;
                }
            }   
        
        
        System.out.println("El caracter "+caracter+ " aparece "+apariciones+ " veces");
        
        char espacios=' ';
        
        int aparicionesespacios=0;
        
        for(int j=0;j<cadena.length();j++){
                if(cadena.charAt(j)==espacios){
                aparicionesespacios++;
            }
        }
        aparicionesespacios=aparicionesespacios+1;
        System.out.println("La cadena tiene "+aparicionesespacios+" palabras");
        
    }
    
}
