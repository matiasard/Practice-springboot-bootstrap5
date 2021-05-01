package ar.edu.unju.fi.tp4.model;

import org.springframework.stereotype.Component;

@Component
public class Producto {
    int codigo ;
    String nombre;
    double precio;
    String marca;
    int stock;
    
    //* Constructor Vacio
    public Producto() {
    }

    public Producto(int codigo, String nombre, double precio, String marca, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto [codigo=" + codigo + ", marca=" + marca + ", nombre=" + nombre + ", precio=" + precio
                + ", stock=" + stock + "]";
    }

    

}
