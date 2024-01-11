package com.matrices;
import com.palabrafinal.Persona;

public class PracticaMatrices {
    public static void main(String[] args) {
        //1_Declaramos una matriz de enteros.
        int[][] edades;

        //2_Instanciamos la matriz de enteros.
        edades = new int[3][2];

        //3_Inicializamos los valores de la matriz de enteros.
        edades[0][0] = 34;
        edades[0][1] = 6;
        edades[1][0] = 33;
        edades[1][1] = 67;
        edades[2][0] = 57;
        edades[2][1] = 22;

        //Imprimimos los valores a la salida estandar.
        //4_Leemos los valores de cada elemento de la matriz
        System.out.println("Matriz enteros: indice [0][0] = " + edades[0][0]);
        System.out.println("Matriz enteros: indice [0][1] = " + edades[0][1]);
        System.out.println("Matriz enteros: indice [1][0] = " + edades[1][0]);
        System.out.println("Matriz enteros: indice [1][1] = " + edades[1][1]);
        System.out.println("Matriz enteros: indice [2][0] = " + edades[2][0]);
        System.out.println("Matriz enteros: indice [2][1] = " + edades[2][1]);


        //1_Matriz[2][3] de tipo String, notación simplificada.
        String[][] nombres = {{"Marta","Maria","Fran"},{"Ana","Williams","John"}};

        //largo de elementos de la matriz. Primero el nº de Filas.
        System.out.println("\nEl largo de Filas es: " + nombres.length);

        //Seleccionando una fila valida nos regresa el nº de columnas.
        System.out.println("El número de columnas es: " + nombres[0].length);

        //Imprimimos los valores a la salida estandar.
        //2_Iteramos la matriz String con un for anidado.
        for (int i = 0; i < nombres.length; i++){
            for (int j = 0; j < nombres[i].length; j++){
                System.out.println("nombre en el indice [" + i +"] [" + j + "] = " + nombres[i][j]);
            }
        }

        System.out.println("\n");
        //Declarar e instanciar una matriz de objetos de tipo Persona.
        Persona[][] personas = new Persona[3][2];
        //Inicializamos los valores de la matriz.
        personas[0][0]= new Persona("Maia");
        personas[1][1]= new Persona("Alina");
        personas[2][0]= new Persona("Romero");

        //Imprimimos e Iteramos con for anidado.
        for (int i = 0; i<personas.length; i++){
            for (int j =0; j<personas[i].length; j++){
                System.out.println("indice [" + i +"] [" + j + "] = " + personas[i][j]);
            }
        }
    }
}
