package com.gimnasio;

import java.util.Scanner;

import com.gimnasio.VOs.Classes;
import com.gimnasio.VOs.User;
import com.gimnasio.services.BookService;
import com.gimnasio.services.ClassesService;
import com.gimnasio.services.UserService;


public class Main {
    public static void main(String[] args) {
    UserService userService = new UserService();
    ClassesService classesService = new ClassesService();
    BookService bookService = new BookService();
    Scanner op = new Scanner(System.in);

    userService.addUser(new User(1, "pepe", "sadasdsdsa", true));
    userService.addUser(new User(2, "pepa", "sadasdsafasfsasa", false));
    userService.addUser(new User(3, "pepi", "sadadgfhtrsdsdsa", true));
    userService.addUser(new User(4, "pepo", "sadaxcbvxcbcsdsdsa", false));
    userService.addUser(new User(5, "pepiu", "sadauyiyiotsdsdsa", true));

    classesService.addClasses(new Classes("1", "Bailoterapia", "32 diciembre 1 am", 30));
     classesService.addClasses(new Classes("2", "Pecho", "31 diciembre 6 am", 26));
    classesService.addClasses(new Classes("3", "Salsa", "30 diciembre 7 am", 36));
     classesService.addClasses(new Classes("5", "Bachata", "23 diciembre 8 am", 38));
     classesService.addClasses(new Classes("4", "Twerking", "3 diciembre 9 am", 24));


     User user =userService.getUserById(3);
    Classes classe = classesService.getClassesById("3");
    User user1 =userService.getUserById(2);
    Classes classe1 = classesService.getClassesById("2");


    System.out.println("RESERVA 1 ................................");
    bookService.addBook(1, user, classe);
    System.out.println("RESERVAA 22222222............");
   bookService.addBook(2, user1, classe1);
        System.out.println("BUSANCO POR ID######################################");
   bookService.getBookById(1);
   bookService.getBookById(3);
        System.out.println("BORRANDO #########");
   bookService.deleteBook(2);
   bookService.deleteBook(8);
        System.out.println("MOSTRANDO##############");

   bookService.getBooks();






   
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