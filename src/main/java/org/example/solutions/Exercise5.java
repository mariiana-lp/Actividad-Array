package org.example.solutions;

import java.util.Scanner;

public class Exercise5{
    /*Se desea escribir un programa que permita manejar la información de habitantes de
    un complejo habitacional. El mismo posee 7 torres; a su vez cada torre posee 20 pisos
    y cada piso 6 departamentos. Se desea saber:
    a) Cantidad total de habitantes del complejo
    b) Cantidad promedio de habitantes por piso de cada torre
    c) Cantidad promedio de habitantes por torre*/

    public static void habitantes_por_torre(){
        Scanner scanner = new Scanner(System.in);
        int [] [] matriz = new int[20][6];
        int [] habitantes_apt = new int[60];
        int promedio = 0;
        int aux;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.println("¿cuanto habitantes hat en el apt #" + (i+1) + " del piso: " + (j+1) );
                aux = scanner.nextInt();
                promedio = promedio + aux;
            }
        }
    }
}
