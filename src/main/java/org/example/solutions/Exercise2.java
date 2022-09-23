package org.example.solutions;


public class Exercise2 {
    /*Elabore un programa que cree un vector de 15 posiciones con números totalmente
    diferente*/

    public static void diferents_nums(){
        int [] array = new int [15];

        for(int i = 0; i < array.length; i++){
            int random_num = (int ) Math.floor((Math.random() * (100 - 1 + 1 )) +1);
            boolean exist = false;

            for (int j = 0; j < array.length; j++){
                if (random_num == array[j])
                    exist=true;
                else
                    exist=false;
            }

            if (exist)
                i--;
            else
                array[i] = random_num;
        }

        show_array(array);
    }

    public static void show_array (int [] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
