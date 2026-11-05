/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_restaurante;

/**
 *
 * @author bisonte
 */
public class EVA3_7_RESTAURANTE {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      String[] menu = {"Tacos", "Papas", "Gorditas", "ensalada", "lazaña", "pepsi", "coca-cola", "hamburgesas", "suchi", "limonada"};
      double[] precio = {20.99, 10.99, 40.99, 30.99, 25.99, 10.99, 10.99, 15.99, 5.99, 67.99 };
      
       System.out.println("--------------------MENU DEL SISTEMA-----------------");
      
      
       for (int i = 0; i < menu.length; i++){
       
       
       
         System.out.println(menu[i] + " <----- precio: " + precio[i]);
         
         
  
   }
   }
   
}
