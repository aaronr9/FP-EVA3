/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_7_cubo;

/**
 *
 * @author Usuario
 */
public class EVA3_7_CUBO {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[][][] cubo= new int [5][5][5];//30 enteros
        //LLENAR CON VALORES ALEATORIOS
        System.out.println(cubo.length);
        System.out.println(cubo[0].length);
        System.out.println(cubo[0][0].length);
        
       for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    cubo[i][j][k] = (int)(Math.random()* 100);
                }
            }
        }
        //IMPRIMIR
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    System.out.print("[" +cubo[i][j][k]+"]");
                }
            }
            
        }
        
        
    }
}
