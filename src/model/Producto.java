package model;

public class Producto {

   private String nombre;
   private float precioUnidad;
   private int cantidad;
   private float precioTotal;

    public Producto(String nombre, float precioUnidad, int cantidad) {
        this.nombre = nombre;
        this.precioUnidad = precioUnidad;
        this.cantidad = cantidad;
        precioTotal = precioUnidad*cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(float precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }       
    
}
