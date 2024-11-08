/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_2_return;

/**
 *
 * @author Usuario
 */
public class EVA3_2_RETURN {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //SI REGRESA RESULTADOS, TENEMOS DOS OPCIONES
        //HACER ALGO CON VALOR
                //GUARDARLO Y USARLO VARIAS VECES
                int valor;
                valor = sumarDosEnteros(100, 50);
                System.out.println("Resultado = " + valor);
                //USARLO UNA VEZ
                System.out.println("Resultado = " + sumarDosEnteros(100, 50));
        //IGNORAR EL VALOR
        sumarDosEnteros(100, 50);
    }
    
    //SUMAR DOS ENTEROS
    public static int sumarDosEnteros(int num1, int num2){
        int resu;
        resu = num1 + num2;
        return resu;
    }
            
}
