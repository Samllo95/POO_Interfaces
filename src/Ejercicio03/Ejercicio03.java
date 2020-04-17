/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio03;

/**
 *
 * @author samll
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        Camisas myPrenda=new Camisas(75.55, "M", "Sian");
        myPrenda.tipoTela("Algodon y Lino");
        myPrenda.estiloCamisa("Camisa con cuello tortuga");
        myPrenda.tipoManga("Manga larga");
        
        System.out.println(myPrenda.datosPrenda());
        
    }
}
