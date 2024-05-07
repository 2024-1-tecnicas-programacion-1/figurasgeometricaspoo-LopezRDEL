package com.mycompany.figurasgeometricaspoo;

public class Circulo extends FiguraGeometrica {
    
    private double radio;
   
    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }
    //Complejidad temporal: O(1) Tiempo constante.
    double obtenerArea() {
        return Math.PI * radio * radio;
    }
    
    //Complejidad temporal: O(1) Tiempo constante.
    double obtenerPerimetro() {
        return 2 * Math.PI * radio;
    }
    
}
