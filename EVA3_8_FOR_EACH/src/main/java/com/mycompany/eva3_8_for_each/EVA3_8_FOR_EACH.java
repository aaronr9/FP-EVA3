/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_8_for_each;

/**
 *
 * @author Usuario
 */
public class EVA3_8_FOR_EACH {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String[] dias = {"Lunes","Martes","Miercoles","jueves","viernes","sabado","domingo"};
    /*for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[i]);
}*/
    for(String cade: dias){
        System.out.println(cade);
    }
    int[]billetes= {20,50,100,200,500,1000};
    for(int billete:billetes)
        System.out.println(billete);
    
    
    }
}
