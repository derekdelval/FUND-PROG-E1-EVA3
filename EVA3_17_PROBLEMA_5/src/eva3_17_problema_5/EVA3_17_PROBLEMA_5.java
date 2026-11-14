/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_17_problema_5;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA3_17_PROBLEMA_5 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
     
      Scanner captu = new Scanner(System.in);
      
      double[][] temp = new double [7][5];
        String[] ciudades = {"Chihuahua", "Cuauhtemoc", "Madera", "Torreon Cuahulia", "Guatemala"};
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "sabado", "domingo"};
        
        int cont = 0;
        
        
        
        for (int i = 0; i < temp.length ; i++) {
           
           System.out.print(" - dia: " + dias[i]);
           cont++;
           System.out.println("");
           for (int j = 0; j < temp[i].length; j++) {
              
              
              System.out.println("Temperatura de la ciudad de " + ciudades[j] + " es de: ");
              temp[i][j] = captu.nextDouble();
          
           }
         
      }
        
        System.out.println("");
        
        for (int j = 0; j < ciudades.length; j++) {
           
            double promedio = 0;
            
            
           for (int i = 0; i < temp.length; i++) {
              
              promedio += temp[i][j];
              
              
           }
           
           promedio = promedio / 7;
           System.out.println("promedio de temperatura de " + ciudades[j] + " es: " + promedio);
           
      }
        
      
   }
   
}
