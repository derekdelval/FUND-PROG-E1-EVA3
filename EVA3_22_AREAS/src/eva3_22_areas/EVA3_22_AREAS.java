/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_22_areas;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA3_22_AREAS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
               

       String[] menu = {"circulo", "Rectangulo", "Triangulo", "salir"};
       int valor;
       
       do{
          
          System.out.println("------Menu formulas------");
          imprimir(menu);
          
           valor = capturaEntero("selecciona la opcion");
           
           
           switch(valor){
           
              case 1:
                 
                 circulo();
                    break;
              case 2: 
                 
                 rectangulo();
                 break;
              
              case 3:
                 
                 triangulo();
                 break;
              
              case 4:
                 
                 
            
           }
       }while(valor  != 4);
       
       
     
      
   }
   public static void imprimir(String[] arreglo){
      
      for (int i = 0; i < arreglo.length; i++) {
         
         System.out.println((i + 1) + ". " + arreglo[i]);
         
      }
   
   }
   
   public static int capturaEntero(String mensaje){
   
   
   Scanner captu = new Scanner(System.in);
   
      System.out.println(mensaje);
      int valor = captu.nextInt();
      
      return valor;
   }
   
   public static double capturaDouble(String mensaje){
   
   
   Scanner captu = new Scanner(System.in);
   
      System.out.println(mensaje);
      double valor = captu.nextDouble();
      
      return valor;
   }
   
   public static void circulo(){
      
      System.out.println("-----------Calcular area de circulo-------");
   double radio = capturaDouble("Captura el radio del circulo: ");
   double area = Math.PI * Math.pow(radio, 2);
      System.out.println("El area del circulo es " + area );
   
   

   }
   
   public static void rectangulo(){
      
      System.out.println("-----------Calcular area de rectangulo-------");
   double base = capturaDouble("Captura la base del rectangulo ");
   double altura = capturaDouble("Captura la base del rectangulo: ");
   double area = base * altura;
      System.out.println("El area del rectangulo3 es " + area );
   
   
   
   }
   
   public static void triangulo(){
      
      System.out.println("-----------Calcular area de triangulo-------");
   double base = capturaDouble("Captura la base del triangulo ");
   double altura = capturaDouble("Captura la base del triangulo: ");
   double area = (base * altura) / 2;
      System.out.println("El area del triangulo es " + area );
   
   
   
   }
   
   
   
   
   

   
   
}
