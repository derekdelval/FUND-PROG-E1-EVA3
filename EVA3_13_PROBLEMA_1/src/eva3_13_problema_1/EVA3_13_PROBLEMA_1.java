/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_problema_1;

import java.util.Scanner;

/**
 *
 * @author herna
 */
public class EVA3_13_PROBLEMA_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Scanner captu = new Scanner(System.in);
      int[] arreglo = new int [10];
      int valor;
      int cont = 0;
      
        System.out.println("Dame un valor (entre el 0 y 9): ");
        valor = captu.nextInt();
        captu.nextLine();
        
        
        for (int i = 0; i < arreglo.length; i++) {
            
            arreglo[i] = (int)(Math.random() * 10);
            System.out.print("[" + arreglo[i] + "]");
            
            if (valor == arreglo[i]){
            
            cont++;
            
            }
            
            
        }
        System.out.println(" El valor: " + valor + " se repite: " + cont + " veces");
        
        
      
      
    }
    
}
