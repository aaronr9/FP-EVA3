/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_3_captura;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA3_3_CAPTURA {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String nombre = capturarTexto("Introduce tu nombre");
        String apellido = capturarTexto("Introduce tu apellido");
        int edad = pedirEdad("Introduce tu edad");
        Double Salario = capturarSalario("Introduce tu Salario");
        System.out.println("nombre: "+ nombre);
        System.out.println("apellido: "+ apellido);
        System.out.println("Salario: "+ Salario);
        System.out.println("Edad: "+ edad);
    }
    
    public static String capturarTexto(String mensaje){
        Scanner captu = new Scanner(System.in);
        String texto;
        System.out.println(mensaje);
        texto = captu.nextLine();
        return texto;
    }
    public static Double capturarSalario(String mensaje) {
        Scanner captu = new Scanner(System.in);
        Double Salario;
        System.out.println(mensaje);
        Salario = captu.nextDouble();
        return Salario;
    }
    
    public static int pedirEdad(String mensaje){
            Scanner captu = new Scanner(System.in);
            int edad;
            System.out.println(mensaje);
            edad = captu.nextInt();
            return edad;
    }
}
   