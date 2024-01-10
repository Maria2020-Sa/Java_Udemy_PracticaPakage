package com.arreglos;

import com.palabrafinal.Persona;

public class PracticaArreglos {
    public static void main(String[] args) {
        //Declaramos un arreglo de enteros
        int[] edades;
        //Instanciamos el arreglo de enteros
        edades = new int[3];
        //Inicializamos los valores del arreglo de enteros
        edades[0] = 6;
        edades[1] = 23;
        edades[2] = 55;
        //Leemos los valores de cada elemento del arreglo.
        System.out.println("Arreglo enteros indice 0: " + edades[0]);
        System.out.println("Arreglo enteros indice 1: " + edades[1]);
        System.out.println("Arreglo enteros indice 2: " + edades[2] + "\n");

        Persona[] personas;
        personas = new Persona[2];
        personas[0] = new Persona("Marta");
        personas[1] = new Persona ("Carlos");
        System.out.println("Arreglo tipo Object indice 0: " + personas[0]);
        System.out.println("Arreglo tipo Object indice 1: " + personas[1] + "\n");

        String[] animales = {"gato", "perro","conejo"};
        System.out.println("Arreglo tipo Object indice 0: " + animales[0] + "\n");

        //recorrer el arreglo animales con un for:
        for (int i = 0; i < animales.length; i++){
            System.out.println("Posición: " + i + ", animal: " + animales[i]);
        }

    }
}

