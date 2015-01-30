/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import java.util.ArrayList;
import model.Producto;


public class Boleta {
    private ArrayList<Producto> productos;
    
    public Boleta(){
      productos = new ArrayList<>();
    }
    
    public float precioTotal(){
      float total = 0;
      for(Producto p : productos){
        total = total + p.getPrecioTotal();
      }
      return total;
    }
    
    public void agregarProducto(Producto p){
      productos.add(p);
    }
    
    public ArrayList<Producto> obtenerProductos(){
      return productos;
    }
}
