package org.example;

import org.example.clases.Empleado;

public class Main {
    public static void main(String[] args) {
        // crear un objeto de la case
        // para usar una clase debo usar un objeto de esa clase
        // un objeto es una variable que no es primitiva
        Empleado empl = new Empleado();

        // usar una clase es acceder a sus atributos y métodos
        // accedo a un atributo para almacenar un valor en memoria
        System.out.println(empl.nombres);
        empl.nombres = "Andrés";
        System.out.println(empl.nombres);
        empl.nombres = "Juan";
        System.out.println(empl.nombres);





        // accedo a un método para disfrutar la funcionalidad del subprograma

        empl.saludar();








    }// fin clase main
}// fin paquete