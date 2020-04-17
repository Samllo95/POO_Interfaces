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
public class FiguraGeometrica implements Area, Perimetro{

    @Override
    public double calcuArea(double h, double b) {
        double area=b*h;
        return area;
    }

    @Override
    public double calcuPerimetro(double l1, double l2, double l3, double l4) {
        double perim=l1+l2+l3+l4;
        return perim;
    }
    
}
