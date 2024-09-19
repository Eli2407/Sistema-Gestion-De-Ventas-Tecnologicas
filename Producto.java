
package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Producto {
    private String nombre;
    private String codigo;
    private String tipo;
    private double precio;
    private List<Fabricante> fabricantes;

    public Producto(String nombre, String codigo, String tipo, double precio, List<Fabricante> fabricantes) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.tipo = tipo;
        this.precio = precio;
        this.fabricantes = fabricantes;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public List<Fabricante> getFabricantes() {
        return fabricantes;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        return Objects.equals(this.codigo, other.codigo);
    }

    

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", codigo=" + codigo + ", tipo=" + tipo + ", precio=" + precio + ", fabricantes=" + fabricantes + '}';
    }
    
    
            
}
