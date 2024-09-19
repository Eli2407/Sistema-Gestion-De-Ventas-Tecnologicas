
package app;

import java.util.Objects;

public class Fabricante {
    private String nombre;
    private String Pais;
    private int añoFundacion;

    public Fabricante(String nombre, String Pais, int añoFundacion) {
        this.nombre = nombre;
        this.Pais = Pais;
        this.añoFundacion = añoFundacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return Pais;
    }

    public int getAñoFundacion() {
        return añoFundacion;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.nombre);
        hash = 13 * hash + Objects.hashCode(this.Pais);
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
        final Fabricante other = (Fabricante) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.Pais, other.Pais);
    }

    @Override
    public String toString() {
        return "Fabricante{" + "nombre=" + nombre + ", Pais=" + Pais + ", a\u00f1oFundacion=" + añoFundacion + '}';
    }
    
    
}
