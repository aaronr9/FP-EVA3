/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._evaluacion_3_examen_practico;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
       calcularPromedio();
        contarCalificacionesMayores();
        obtenerCalificacionMasAlta();
        obtenerCalificacionMasBaja();
     }
    public static void calcularPromedio(){
       int numAlumno;
        int califas[];
        String nombres[];
        Scanner captu = new Scanner(System.in);
        System.out.println("Cantidad de calificaciones a capturar:");
        numAlumno = captu.nextInt();
        captu.nextLine();
        califas = new int[numAlumno];
        nombres = new String[numAlumno];
        
        for (int i = 0; i < califas.length ; i++) {
            System.out.println("nombre estudiante #" + i);
            nombres[i] = captu.nextLine();
            
            System.out.println("Calificacion estudiante #" + i);
            califas[i] = captu.nextInt();
            captu.nextLine();
        }
        for (int i = 0; i < califas.length; i++) {
            System.out.println(nombres[i] + "=" + califas[i]);
        }
     }
    public static void contarCalificacionesMayores(){
        
    }
    public static void obtenerCalificacionMasAlta(){
        
    }
    public static void obtenerCalificacionMasBaja(){
        
    }
    
}
