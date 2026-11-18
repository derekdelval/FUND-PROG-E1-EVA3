/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_18_metodos;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA3_18_METODOS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      
      //LLAMAR O INVOCAR EL METODO
      
      mostrarMensaje("Hola mundo!!");
      mostrarMensaje("Derek Delval");
      mostrarMensaje("Fundamentos de programacion!!");
      mostrarMensaje("SISTEMAS COMPUTACIONALES!!");
      
      System.out.println("");
      //QUE HACER CON METODOS QUE REGRESAN VALORES
      //1. RECUPERAR EL VALOR PATA USARLO DESPUES
      int resultado = sumar(10,20);
      System.out.println("suma de 10 + 20 = " + resultado);
      //2.  USARLO DIRECTAMENTE
      System.out.println("suma de 10 + 20 = " + sumar(10,20));
      //3. NO IMPORTA EL VALOR DE RETORNO
      sumar(10,20);
   }
   
   // modificadores valores de retorno
   
                     //debe ser un verbo infinitivo
                     //varias palabras: iniciar en minusculas, demas iniciar en mayuscula
   public static void mostrarMensaje(String mensaje) //CABECERA
   {//CUERPO DEL METODO O IMPLEMENTACION
      
         System.out.println(mensaje);
   
   }
   
   public static int sumar(int val1, int val2){
      
        int resu = val1 + val2;                 
        
        return resu;
   }
}
