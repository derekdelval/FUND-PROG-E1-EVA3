/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_16_problema_4;

import java.util.Scanner;

/**
 *
 * @author herna
 */
public class EVA3_16_PROBLEMA_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner captu = new Scanner(System.in);
        
        int[][] asistencias = new int [3][5];
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
        int estudiante = 0;
        
        
        
        for (int i = 0; i < asistencias.length; i++) {
            estudiante++;
           System.out.println("Estudiante " + estudiante);
           
            for (int j = 0; j < asistencias[i].length; j++) {
                
                System.out.print("  Asistencia del dia " + dias[j] + " ( 1 o 0 ): ");
                asistencias[i][j] = captu.nextInt();
                
       
        
        }
        }
        System.out.println("");
        
        estudiante = 0;
        
        for (int i = 0; i < asistencias.length; i++) {
            
            estudiante++;
            
            int asistencia = 0;
            int inasistencia = 0;
            for (int j = 0; j < asistencias[i].length; j++) {
                
                if ( 1 == asistencias[i][j]){
                
                asistencia++;
                    
                }else {
                
                inasistencia++;
                
                }
                
            }
            
            System.out.println("asistencias del estudiente" + estudiante + ": " + asistencia + "  insasistencias: " + inasistencia);
            
            
        }
        
        
    }
    
}
