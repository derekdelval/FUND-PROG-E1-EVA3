/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_arreglos;

/**
 *
 * @author bisonte
 */
public class EVA3_2_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int arreglo[], x, y; // Solo "arreglo" es un arreglo
        //int[] arreglo, x, y; //todos son arreglos
        
        
        arreglo = new int[10];//arreglo con 10 enteros
        
        //arreglo[10] = 100; El indice es incorrecto, 10 no es una posicion valida
        
       //EL USO DE ARREGLOS VA LIGADO AL USO DE CICLOS
       //EN PARTICULAR EL CICLO FOR
       
       for  (int i = 0; i < 10; i++ ){
           
           
            arreglo[i] = (int)(Math.random() * 100); //CASTING --> COMPATIBLES
   
       }
       
       for  (int i = 0; i < 10; i++ ){
       System.out.print(arreglo[i] + " - ");
       
       }
    }
    
}
