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
public class Camisas extends PrendaVestir implements Tela, EstiloCamisa{
    public double precio;
    public String tTela;
    public String eCamisa;
    public String tManga;

    public Camisas(double precio, String talla, String color) {
        super(talla, color);
        this.precio = precio;
    }

    @Override
    public void tipoTela(String tt) {
        this.tTela=tt;
    }

    @Override
    public void estiloCamisa(String ec) {
        this.eCamisa=ec;
    }
    
    @Override
    public void tipoManga(String tm) {
        this.tManga=tm;
    }

    @Override
    public String datosPrenda() {
        String msj="Tipo de tela: " + this.tTela + "\n" +
                "Estilo: " + this.eCamisa + "\n" +
                "Tipo de Manga: " + this.tManga + "\n" +
                "Precio de la prenda: " + this.precio + "\n";
        return super.datosPrenda() + msj;
    }

    
    
    
}
