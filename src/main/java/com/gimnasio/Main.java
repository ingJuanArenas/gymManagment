package com.gimnasio;

import java.util.Scanner;

import com.gimnasio.VOs.Classes;
import com.gimnasio.services.BookService;
import com.gimnasio.services.ClassesService;
import com.gimnasio.services.UserService;


public class Main {
    public static void main(String[] args) {
    UserService userService = new UserService();
    ClassesService classesService = new ClassesService();
    BookService bookService = new BookService();
    Scanner op = new Scanner(System.in);

    firstMenu(op);

   
    }

    private static Scanner firstMenu(Scanner op) {
        System.out.println("""
                BIENVENIDO AL SISTEMA DE GESTION DEL GIMNASIO !!!!!!!
                SELECCIONE LA ACCION QUE DESEA REALIZAR

                1. MANEJO DE USUARIOS
                2. MANEJO DE CLASES
                3. MANEJO DE RESERVAS
                
                """);

                op.nextInt();
                return op;
    }
    


}