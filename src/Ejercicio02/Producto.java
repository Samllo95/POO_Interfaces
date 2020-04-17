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
public class Producto implements Impuesto, Caducidad{
    public int yearElaboracion;
    public int yearCad;
    public double precio;
    public double precioImp;

    public Producto(int yearElaboracion, double precio) {
        this.yearElaboracion = yearElaboracion;
        this.precio = precio;
    }
    
    @Override
    public void aplicaImpuesto() {
        double impuesto=this.precio+(this.precio*0.13);
        String formimp=String.format("%.2f", impuesto);
        this.precioImp=Double.valueOf(formimp);
    }

    @Override
    public void fechaCaduca() {
        this.yearCad=this.yearElaboracion+4;
    }
    
    public String datosProd(){
        String datos="Año de fabricacion: " + this.yearElaboracion + "\n" +
                     "Año en que caduca: " + this.yearCad + "\n" +
                     "Precio: " + this.precio + "\n" +
                     "Precio con impuesto: " + this.precioImp + "\n";
        return datos;
        
    }
    
}
