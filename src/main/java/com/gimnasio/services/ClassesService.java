package com.gimnasio.services;

import java.util.ArrayList;
import java.util.List;

import com.gimnasio.Exceptions.NotFoundException;
import com.gimnasio.Model.Classes;

public class ClassesService {
    private List<Classes> listClasses = new ArrayList<>();

    public ClassesService (List<Classes> listClasses){
        this.listClasses = listClasses;
    }

     public void getClasses(){
        for (Classes classes : listClasses) {
            System.out.println("Nombre de clase: "+ classes.getClassName()+ " Fecha: "+ classes.getDate()+" ID: "+ classes.getId()+
             " Capacidad: " + classes.getMaximumCapacity());
        }
    }

    public void addClasses(Classes classe){
        boolean existC = listClasses.stream().anyMatch( c -> c.getId() == classe.getId());
        if (existC) {
            System.out.println("El id: " + classe.getId() + "ya ha sido registrado");
        }else{
            listClasses.add(classe);
            System.out.println("Clase creada exitosamente...............");
        }
    }

    public Classes getClassesById(String id)throws NotFoundException{
        Classes findClasses = listClasses.stream().filter(c -> c.getId() == id).findFirst().orElse(null);

        if (findClasses != null) {
            System.out.println("Clase encontrada ..................");
             System.out.println("Nombre de clase: "+ findClasses.getClassName()+ " Fecha: "+ findClasses.getDate()+" ID: "+ findClasses.getId()+
             " Capacidad: " + findClasses.getMaximumCapacity());
        }else{
         throw new NotFoundException("La clase con id: "+ id+ " no ha sido encontrada.");
        }

        return findClasses;
    }

    public void deleteClassesById(String id)throws NotFoundException{
        Classes classeToRemove= getClassesById(id);

        if (classeToRemove != null) {
            System.out.println("Eliminando clase ...............");
            listClasses.remove(classeToRemove);
        }else{
            System.out.println("La clase con id: "+ id+ " no ha sido encontrada."); 
        }
    }


    
}
