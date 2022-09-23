package org.example.solutions;

import java.util.Scanner;

public class Exercise3 {
    /*Dados 50 números enteros almacenarlos en un vector, obtener el promedio de ellos.
    Mostrar por pantalla dicho promedio y los números ingresados que sean mayores que
    el mismo.*/
    public static void average_and_max(){
        Scanner scanner = new Scanner(System.in);
        int [] array = new int [50];

        for(int i = 0; i < array.length; i++){
            System.out.println("Ingrese numero: " );
            array[i] = scanner.nextByte() ;
        }

        System.out.println("Los numeros ingresados son:");
        show_array(array);
        highers_than_average(array);
    }

    public static void show_array (int [] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static int get_average (int [] array){
        int sum = 0;

        for(int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }

        return ((int) sum / array.length);
    }

    public static void highers_than_average(int [] array) {
        int average = get_average(array);
        System.out.println("El promedio es: " + average + ". Los numeros mayores son: ");

        for(int i = 0; i < array.length; i++){
            if (array[i] > average)
                System.out.println(array[i]);
        }
    }

}
