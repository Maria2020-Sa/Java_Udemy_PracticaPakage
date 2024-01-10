package com.palabrafinal;

public final class ClaseFinal {
    //Variable marcada como FINAL: solo se puede asignar valor en esta misma variable o dentro de un constructor,
    // se debe asignar un valor ya que el mismo no podra ser modificado.
    public final int varNumero = 10;

    //Constante en java: se convinan los modificadores de static y final, SE ESCRIBE CON MAYUSCULA Y SE SEPARA CON _
    public static final int VAR_PRIMITIVO = 15;
    public static final Persona VAR_PERSONA = new Persona();

    //Metodo final. Lo veremos a detalle en el tema de sobreescritura.
    //La palabra final en el metodo de la clase padre, significa que ya no podemos
    // sobreescribir o modificar el comportamiento del mètodo en la clase hija.
    public final void metodoFinal(){}

}

//No es posible crear clases Hijas de una clase marcada como FINAL.
//class ClaseHija extends ClaseFinal {

    //No es posible modificar el comportamiento (sobreescritura)
    //de un metodo padre marcado como final.
    //public void metodoFinal() {}
//}
