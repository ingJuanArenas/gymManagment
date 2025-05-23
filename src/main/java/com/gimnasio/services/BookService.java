package com.gimnasio.services;

import java.util.ArrayList;
import java.util.List;

import com.gimnasio.Exceptions.NotFoundException;
import com.gimnasio.Model.Books;
import com.gimnasio.Model.Classes;
import com.gimnasio.Model.User;

public class BookService {
    private List<Books> books= new ArrayList<>();

    public void getBooks(){
        for (Books b : books) {
        System.out.println("ID: "+b.getId()+" Nombre de la clase: "+ b.getclasse().getClassName()+ " para: "+ b.getUser().getName());
        }
    }

    public Books getBookById(int id) throws NotFoundException{
        Books existBook= books.stream().filter(b -> b.getId() == id).findFirst().orElse(null);
        
        if (existBook != null) {
            System.out.println("ID: " +id+ " Nombre de la clase: "+ existBook.getclasse().getClassName()+ " Persona:"+ existBook.getUser().getName());
        }else{
            throw new NotFoundException("La reserva con ID: " + id+ " no ha sido encontrada!");
        }

        return existBook;
    }

    public void addBook( int id, User user, Classes c){


        // verify if the user has the membresy active,so we can book his class
        if (!user.isMembresyStatus()) {
            System.out.println("El usuario no tiene membresia activada.");
            return;
        }

        // veify if the class has gotten its maximum capacity 

        long bookClass = books.stream().filter(b -> b.getclasse().getId() == c.getId()).count();
        if (bookClass >= c.getMaximumCapacity()) {
            System.out.println("La clase ya está llena.");
             return;
        }

        // verify if the user had not booked the class.
        boolean isAlreadBooked = books.stream().anyMatch(b -> b.getUser().getId() == user.getId()
        && b.getclasse().getId() == c.getId());

        if (isAlreadBooked) {
            System.out.println("El usuario ya ha reservado esta clase.");
             return;
        }

        // if its avalaible to book the class, booked !!
        Books newBook= new Books(id, user, c);
        books.add(newBook);
        System.out.println("Reserva exitosa para: "+ user.getName()+ " En la clase: "+ c.getClassName()+ "el:"+ c.getDate());

        
    }


    public void deleteBook(int id)throws NotFoundException{

        Books bookToRemove = getBookById(id);

        if (bookToRemove != null) {
            System.out.println("Eliminando reserva ............");
            books.remove(bookToRemove);
        }else{
            System.out.println("La reserva no fue encontrada!");
        }

    }

}
