/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_5_examen_2da;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA3_5_EXAMEN_2DA {
    
    static final int PIEDRA = 1;
    static final int PAPEL = 2;
    static final int TIJERA = 3;
    
    public static final int EMPATE=0;
    public static final int GANA=1;
    public static final int PIERDE=2;
    

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int resu;
        int jugada;
        int resuJug;
        
        do{
           resu = pedirJugada("Introduce tu jugada (1-piedra, 2-papel, 3-tijera, 0-salir)");
           jugada = generarJugadaComp();
            System.out.println(jugada);
            resuJug = evaluarPartida(resu, jugada);
            System.out.println(resuJug);
        }while(resu != 0);
    }
    
    //PEDIR DATOS AL USUARIO
    public static int pedirJugada(String mensaje){
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        int seleccion = captu.nextInt();
        return seleccion;
    }
    //GENERAR LA JUGADA DE LA COMPUTADORA
    public static int generarJugadaComp(){
        int jugada;
        double valor = Math.random();
        //¿COMO GENERAMOS LA JUGADA?
        if((valor >= 0) && (valor< 0.3))
            jugada = PIEDRA;//piedra
        else if ((valor >= 0.3)&& (valor < 0.6))
            jugada= PAPEL;//papel
        else
            jugada = TIJERA;//tijera
        return jugada;
    }
    //EVALUAR LA JUGADA
    public static int evaluarPartida(int jugadaUsu, int jugadaComp){
        int resu; // 0-empate, 1-gana, 2-pierde
        if ((jugadaUsu ==PIEDRA)&& (jugadaComp == PIEDRA))
            resu =EMPATE;
        else if((jugadaUsu == PIEDRA)&&(jugadaComp==PAPEL))
            resu =PIERDE;
        else if((jugadaUsu == PIEDRA)&&(jugadaComp==TIJERA))
            resu =GANA;
        else if((jugadaUsu == PAPEL)&&(jugadaComp==PIEDRA))
            resu =GANA;
        else if((jugadaUsu == PAPEL)&&(jugadaComp==PAPEL))
            resu =EMPATE;
        else if((jugadaUsu == TIJERA)&&(jugadaComp==TIJERA))
            resu =PIERDE;
        else if((jugadaUsu == TIJERA)&&(jugadaComp==PIEDRA))
            resu =GANA;
        else if((jugadaUsu == PIEDRA)&&(jugadaComp==PAPEL))
            resu =PIERDE;
        else if((jugadaUsu == PIEDRA)&&(jugadaComp==TIJERA))
            resu =GANA;
        else if((jugadaUsu == PIEDRA)&&(jugadaComp==PAPEL))
            resu =PIERDE;
        else 
            resu=EMPATE;
        return resu;
    }
}
