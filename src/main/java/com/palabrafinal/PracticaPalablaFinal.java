package com.palabrafinal;

public class PracticaPalablaFinal {
    public static void main(String[] args) {
        //Modificar un atributo final, no es posible modificarlo.
        //ClaseFinal.VAR_PRIMITIVO = 20;

        //Modificar la referencia de un atributo de tipo object. No se puede.
        //ClaseFinal.VAR_PERSONA = new Persona();

        ClaseFinal.VAR_PERSONA.setNombre("Maria");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());

        ClaseFinal.VAR_PERSONA.setNombre("Francisco");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());
    }
}
