/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_14_problema_2;

import java.util.Scanner;

/**
 *
 * @author herna
 */
public class EVA3_14_PROBLEMA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
      Scanner captu = new Scanner(System.in);
      int[] arreglo = new int [10];
      int valormax = 0, valormin = 99;
      
        for (int i = 0; i < arreglo.length; i++) {
            
          arreglo[i] = (int)(Math.random() * 100);
          System.out.print("[" + arreglo[i] + "]");  
            
          
          
          
          if (valormin > arreglo[i]){
          
              
              valormin = arreglo[i];
              
          }
          if (valormax < arreglo[i]){
              
              valormax = arreglo[i];
              
              
          }
          
        }
        System.out.println("");
        System.out.println("valor mayor: " + valormax + "  valor menor: " + valormin);
    }
    
}
