package com.gimnasio.juanpablo;

import java.util.List;
import java.util.Scanner;

public class PersonaService {

    private static  List<Persona> personas;

    public  PersonaService(List<Persona> personas){
        this.personas =personas;
    }

    public  void capturarPersonas(Scanner scanner) {
    for (int i = 0; i < 5; i++) {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Género (masculino/femenino): ");
        String genero = scanner.nextLine().toLowerCase();

        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); 

        personas.add(new Persona(nombre, apellido, genero, edad));
    }
    System.out.println("Personas capturadas correctamente.");
}


        public  void contarGenero (String genero){
            int total = 0;
            for (Persona p : personas) {
                if (p != null && p.getGenero().equalsIgnoreCase(genero)) {
                    total++;
                }
            }
            System.out.println("El número total de personas de genero "+genero+ " es: "+ total);
        }


        public  void mostarNombreYGenero () {
            for (Persona p : personas) {
                System.out.println("Nombre: " + p.getNombre() + " Genero: " + p.getGenero());
            }
        }

        public  void calcularPromedioEdad () {
            int suma = 0;
            double promedio;
            for (Persona p : personas) {
                suma += p.getEdad();
            }

            promedio= suma / personas.size();
            if (suma== 0) {
                System.out.println("El promedio es 0, no se han encontrado datos.");
            }  else{
                System.out.println("El promedio de las edades guardadas es: "+ promedio);
            }
        }
    }


    

