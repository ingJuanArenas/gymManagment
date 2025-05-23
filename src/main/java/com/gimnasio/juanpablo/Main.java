package com.gimnasio.juanpablo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        PersonaService ps = new PersonaService(personas);

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Capturar personas");
            System.out.println("2. Mostrar nombre y género");
            System.out.println("3. Calcular promedio de edad");
            System.out.println("4. Contar personas de género Masculino");
            System.out.println("5. Contar personas de género Femenino");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (opcion) {
                case 1:
                    ps.capturarPersonas(scanner);   
                    break;
                case 2:
                    ps.mostarNombreYGenero();
                    break;
                case 3:
                    ps.calcularPromedioEdad();
                    break;
                case 4 :
                    ps.contarGenero("masculino");
                    break;
                case 5:
                    ps.contarGenero("femenino");
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 6);



    }
}
