package org.example.solutions;

import java.util.Scanner;

public class Exercise4 {
    /*Un instituto desea controlar los resultados de los alumnos en las distintas asignaturas
    de la facultad de Ingeniería. El programa debe ingresar las calificaciones de los
    alumnos y visualizar en pantalla la media de notas por alumno y la media de notas
    por asignatura. Las asignaturas están codificadas de 1 a 6 y hay 30 alumnos. (Matrices)*/

    public static void notes() {
        Scanner scanner = new Scanner(System.in);
        int [] [] notes = new int[30][6];
        double average =  0;

        for(int i = 0; i < notes.length; i++){
            for(int j = 0; j < notes[i].length; j++){
                System.out.println("Ingrese nota para la asignatura con id " + (j+1) + " y alumono con id: " + (i+1));
                notes[i][j] = scanner.nextInt();
                average = average + notes[i][j];
            }

            average = average/6;
            System.out.println("El promedio del alumno con id: " + (i+1) + " es: " + average);
        }
    }
}
