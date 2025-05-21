package com.gimnasio.services;

import java.util.ArrayList;
import java.util.List;

import com.gimnasio.VOs.Books;
import com.gimnasio.VOs.Classes;
import com.gimnasio.VOs.User;

public class BookService {
    private static UserService us = new UserService();
    private static ClassesService cs= new ClassesService();
    private List<Books> books= new ArrayList<>();

    public void getBooks(){
        for (Books b : books) {
        System.out.println("ID: "+b.getId()+" Nombre de la clase: "+ b.getclasse().getClassName()+ " para: "+ b.getUser().getName());
        }
    }

    public void addBook( int id, User user, Classes c){

        // verify if the user has the membresy active,so we can book his class
        if (!user.isMembresyStatus()) {
            System.out.println("El usuario no tiene membresia activada.");
        }

        // veify if the class has gotten its maximum capacity 

        long bookClass = books.stream().filter(b -> b.getclasse().getId() == c.getId()).count();
        if (bookClass >= c.getMaximumCapacity()) {
            System.out.println("La clase ya está llena.");
        }

        // verify if the user had not booked the class.
        boolean isAlreadBooked = books.stream().anyMatch(b -> b.getUser().getId() == user.getId()
        && b.getclasse().getId() == c.getId());

        if (isAlreadBooked) {
            System.out.println("El usuario ya ha reservado esta clase.");
        }

        // if its avalaible to book the class, booked !!
        Books newBook= new Books(id, user, c);
        books.add(newBook);
        System.out.println("Reserva exitosa para: "+ user.getName()+ " En la clase: "+ c.getClassName()+ "el:"+ c.getDate());

        
    }

}
