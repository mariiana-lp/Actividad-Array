package org.example.solutions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercise6 {
    /*Diseñar un algoritmo que lea una secuencia de 10 números como máximo y los
    almacene en un vector. El programa debe devolver el vector inverso.*/

    public static void array_reverse () {
        Scanner scanner= new Scanner(System.in);

        String secuence;
        String [] array;
        boolean aux = false;
        do {
            System.out.println("Ingrese secuencia de numeros no mayor a 10");
            secuence = scanner.next();
            array = secuence.split("");

            if(array.length > 10)
                aux = true;
            else
                aux = false;

        }while (aux);

        Collections.reverse(Arrays.asList(array));
        show_array(array);
    }

    public static void show_array (String [] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

}

