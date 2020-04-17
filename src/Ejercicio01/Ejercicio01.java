/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio01;

/**
 *
 * @author samll
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        FiguraGeometrica myFig=new FiguraGeometrica();
        System.out.println("El Area del Rectangulo es: " + myFig.calcuArea(4, 7) + "m");
        System.out.println("\n");
        System.out.println("El Perimetro del Rectangulo es: " + myFig.calcuPerimetro(4, 7) + "m");
    }
}
