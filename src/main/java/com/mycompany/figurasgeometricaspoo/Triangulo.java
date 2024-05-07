package com.mycompany.figurasgeometricaspoo;

public class Triangulo extends FiguraGeometrica {
    
    private double base;
    private double altura;
    
     public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }
     //Complejidad temporal: O(1) Tiempo constante.
    double obtenerArea() {
        return (base * altura) / 2;
    }
    
    //Complejidad temporal: O(1) Tiempo constante.
    double obtenerPerimetro() {
        return 3 * base;
    }
}
