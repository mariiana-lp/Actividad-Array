package org.example.solutions;

public class Exercise7 {
    /*Diseñar un algoritmo que llene una matriz de tamaño 3×4. Calcular el promedio de
    los 12 valores almacenados en dicha matriz. Determinar cuántos son mayores que la
    media. Visualizar por pantalla los siguientes datos y en éste orden: promedio, número
    de datos mayores que el promedio y lista de valores mayores que el promedio*/

    public static void calculate () {
        int [] [] array = new int[3][4];
        int random_num;
        double average = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                random_num = (int ) Math.floor((Math.random() * (100 - 1 + 1 )) +1);
                array[i][j] = random_num;
                average = average +array[i][j];
            }
        }
        average= average/12;
        show_matriz(array);
        highers_than_average((int)average, array);

    }

    public static void highers_than_average(int average, int [] [] array){
        System.out.println("El promedio es: " + average );
        int count = 0;

        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] > average) {
                    count++;
                }
            }
        }
        System.out.println("Cantidad de numeros mayores al promedio " + count);
        System.out.println("Los numeros mayores al promedio son: ");
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] > average) {
                    System.out.println("|" + array[i][j] + "|");
                }
            }
        }

    }

    public static void show_matriz (int [] [] array){
        for(int i = 0; i < array.length; i++){
            System.out.print("|");
            for (int j = 0; j < array[i].length; j ++){
                System.out.print (array[i][j]);
                if (j!=array[i].length-1) System.out.print("\t");
            }
            System.out.println("|");
        }
    }


}
