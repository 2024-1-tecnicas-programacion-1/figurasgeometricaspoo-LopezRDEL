
package com.mycompany.figurasgeometricaspoo;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       //Complejidad temporal: O(1) Tiempo constante.
        System.out.println("Ingrese el nombre de la figura:");
        String nombre = scanner.nextLine();
        
        //Complejidad temporal: O(1) Tiempo constante.
        System.out.println("Ingrese el color de la figura:");
        String color = scanner.nextLine();

        //Complejidad temporal: O(1) Tiempo constante.
        System.out.println("Ingrese el tipo de figura (1: Círculo, 2: Rectángulo, 3: Triángulo):");
        int tipoFigura = scanner.nextInt();

        FiguraGeometrica figura = null;

        //Complejidad temporal: O(1) Tiempo constante.
        switch (tipoFigura) {
                //Complejidad temporal: O(1) Tiempo constante.
            case 1: 
                System.out.println("Ingrese el radio del círculo:");
                double radio = scanner.nextDouble();
                figura = new Circulo(nombre, color, radio);
                break;
                //Complejidad temporal: O(1) Tiempo constante.
            case 2: 
                System.out.println("Ingrese el valor del lado 1 del rectángulo:");
                double lado1 = scanner.nextDouble();
                System.out.println("Ingrese el valor del lado 2 del rectángulo:");
                double lado2 = scanner.nextDouble();
                figura = new Rectangulo(nombre, color, lado1, lado2);
                break;
                //Complejidad temporal: O(1) Tiempo constante.
            case 3: 
                System.out.println("Ingrese el valor de la base del triángulo:");
                double base = scanner.nextDouble();
                System.out.println("Ingrese el valor de la altura del triángulo:");
                double altura = scanner.nextDouble();
                figura = new Triangulo(nombre, color, base, altura);
                break;
            default:
                System.out.println("Tipo de figura no reconocido");
                System.exit(0);
        }
        //Complejidad temporal: O(1) Tiempo constante.
        scanner.close();
    }
}

