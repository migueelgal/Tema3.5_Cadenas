
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author miguel.galera
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Dime una frase: ");
        String frase=teclado.nextLine().toLowerCase();
        
        //.toLoweCase() para convertir la frase a minúscula porque las vocales mayúsculas no nos la cuenta
        

        int vocales=0;
        int consonantes=0;
        
        for(int i=0;i<frase.length();i++){
            switch(frase.charAt(i)){
                case 'a','e','i','o','u':
                    vocales++;
                    break;
                    
                //PARA QUE NO CUENTE NUMEROS NI ESPACIOS COMO CONSONANTES
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case ' ':
                    break;
                    
                default:
                    consonantes++;
                    break;
            }
        }
        
        System.out.println("El número de vocales es: "+vocales);
        System.out.println("El número de consonantes es: "+consonantes);
       
            
        }
       
        
        
        
        
        
        
    }
    

