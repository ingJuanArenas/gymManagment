package com.gimnasio.Exceptions;

public class NotFoundException extends Exception{
    String message;
    public NotFoundException (String message){
        this.message= message;
    }
}
