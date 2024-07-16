package com.example.literalura;

import java.util.Scanner;

public class Menu {

    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int option = -1;

        while (option != 0) {
            System.out.println("BIENVENIDO A LITERALURA\n");
            System.out.println("1 - Agregar Libro por Nombre");
            System.out.println("2 - Libros buscados");
            System.out.println("3 - Buscar libro por Nombre");
            System.out.println("4 - Buscar todos los Autores de libros buscados");
            System.out.println("5 - Buscar Autores por Año");
            System.out.println("6 - Buscar Libros por Idioma");
            System.out.println("7 - Top 10 Libros más Descargados");
            System.out.println("8 - Buscar Autor por Nombre");
            System.out.println("0 - Salir");
            System.out.print("\nINGRESE UNA OPCION: ");

            option = scanner.nextInt();

            // Implementa la funcionalidad para cada opción aquí
        }
        scanner.close();
    }
}







