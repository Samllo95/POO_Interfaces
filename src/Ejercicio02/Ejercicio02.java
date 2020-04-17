/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio02;

/**
 *
 * @author samll
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        Producto myProd=new Producto(2019, 22.55);
       
        myProd.aplicaImpuesto();
        myProd.fechaCaduca();
        System.out.println(myProd.datosProd());
        
    }
}
