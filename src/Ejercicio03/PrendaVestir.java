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
public abstract class PrendaVestir {
    public String talla;
    public String color;

    public PrendaVestir() {
    }
    public PrendaVestir(String talla, String color) {
        this.talla = talla;
        this.color = color;
    }
    
    public String datosPrenda(){
        String msj="Talla de la prenda: " + this.talla + "\n" +
                   "Color de la prenda: " + this.color + "\n";
        return msj;
    }
    
}
