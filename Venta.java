
package app;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Venta {
    private Producto productos;
    private int cantidad;
    private Date fecha;
    private double total;

    public Venta(Producto productos, int cantidad, Date fecha, double total) {
        this.productos = productos;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.total = total;
    }

    public Producto getProductos() {
        return productos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public double getTotal() {
        return total;
    }
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.productos);
        hash = 37 * hash + Objects.hashCode(this.fecha);
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
        final Venta other = (Venta) obj;
        if (!Objects.equals(this.productos, other.productos)) {
            return false;
        }
        return Objects.equals(this.fecha, other.fecha);
    }

    @Override
    public String toString() {
        return "Venta{" + "productos=" + productos + ", cantidad=" + cantidad + ", fecha=" + fecha + ", total=" + total + '}';
    }
    
    
}
