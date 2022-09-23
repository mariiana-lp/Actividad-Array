package org.example.solutions;

import java.util.Scanner;

public class Exercise1 {
    /*Elaborar una clase que permita leer una matriz de m *m se debe de llenar
    aleatoriamente, imprima el mayor por columna, el menor por fila y la matriz ordenada
    descendentemente en un vector*/

    public static void calculate_array(){
        int[][] array = create_array();
        show_matriz(array);
        lower_by_rows(array);


    }

    public static void show_matriz (int [][] array){
        for(int i = 0; i < array.length; i++){
            System.out.print("|");
            for (int j = 0; j < array[i].length; j ++){
                System.out.print (array[i][j]);
                if (j!=array[i].length-1) System.out.print("\t");
            }
            System.out.println("|");
        }
    }

    public static int[][] create_array(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas de la matriz: ");
        int rows = scanner.nextInt();
        System.out.println("Ingrese la cantidad de columnas de la matriz: ");
        int columns = scanner.nextInt();

        int [][] array = new int[rows][columns];

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = (int ) Math.floor((Math.random() * (100 - 1 + 1 )) +1);
            }
        }

        return array;
    }

    public static void lower_by_rows(int [][] array){
        int aux = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                aux = array[i][j];
                if (aux > array[i][j]){
                    aux = array[i][j];
                }
            }
            System.out.println("El menor por la fila con id: " + i + " es: " + aux);
        }
    }

    public static void columns(int [][] array){
        int aux = 0;
        int i = 0;

            for(int j = 0; j < array[i].length; j++){
                aux = array[i][j];
                if (aux > array[i][j]){
                    aux = array[i][j];
                }
                i++;

            System.out.println("El menor por la fila con id: " + i + " es: " + aux);
        }
    }

}
