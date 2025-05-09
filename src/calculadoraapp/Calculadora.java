/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraapp;

/**
 *
 * @author ericb
 */
public class Calculadora {

    public int suma(int a, int b) {
        return a + b;
    }

    public int resta(int a, int b) {
        return a - b;
    }

    public int multiplicacio(int a, int b) {
        return a * b;
    }

    public double divisio(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("No es pot dividir per zero.");
        }
        return a / b;
    }
}
