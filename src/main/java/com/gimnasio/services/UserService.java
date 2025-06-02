package com.gimnasio.services;
import java.util.ArrayList;
import java.util.List;

import com.gimnasio.Exceptions.NotFoundException;
import com.gimnasio.Model.User;

public class UserService {
    private List<User> users = new ArrayList<>();

        public UserService(List<User> users) {
        this.users = users;
    }

     public void getUsers(){
        for (User user : users) {
            System.out.println("Nombre: "+ user.getName()+ " Email: "+ user.getEmail()+" ID: "+ user.getId()+
             " Estado: "+ (user.isMembrershipStatus() ? "ACTIVA" : "VENCIDA"));
        }
    }

     public User getUserById(int id)throws NotFoundException{
       User findUser= users.stream().filter( u-> u.getId() == id).findFirst().orElse(null);
        if (findUser != null) {
            System.out.println("Usuario encontrado .........");
            System.out.println("Nombre: "+ findUser.getName()+ " Email: "+ findUser.getEmail()+" ID: "+ findUser.getId()+
             " Estado: "+ (findUser.isMembrershipStatus() ? "ACTIVA" : "VENCIDA"));
        }else{
            throw new NotFoundException("Usuario con id: "+ id + " no encontrado");
        }
         return findUser;
    }

    public void addUser(User user){
       boolean existUser=  users.stream().anyMatch(u-> u.getId()== user.getId());
       if (existUser) {
            System.out.println("El usuario con id: "+ user.getId() + " ya se encuentra registrado!");
       }else{
        users.add(user);
        System.out.println("Usuario creado exitosamente!!");
       }
    }



    public void deleteUser(int id)throws NotFoundException{
            User userToRemove = getUserById(id);

            if (userToRemove != null) {
                users.remove(userToRemove);
                System.out.println("Eliminado correctamente...........");
            }else{
                System.out.println("No existe usuario con id: "+ id);
            }
        }


    }

    

