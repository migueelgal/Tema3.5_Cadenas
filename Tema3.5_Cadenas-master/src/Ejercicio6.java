
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Recoger un char por telcado");
        System.out.println("---------------------------");
        
        
        //USANDO UN STRING
//        String cadena;
//        
//        do{
//            System.out.println("¿Quieres continuar [S]||[N]?");
//            cadena=teclado.nextLine().toUpperCase();                      
//        }while (cadena.equals("S"));
//        
//    }
//    
    
    //USANDO UN CARACTER
    
        char continuar;
        
        do{
            System.out.println("¿Quieres continuar [S]||[NO]? ");
            continuar=teclado.nextLine().charAt(0);
            continuar=Character.toUpperCase(continuar); 
            }while (continuar == 'S');

    
        }

}