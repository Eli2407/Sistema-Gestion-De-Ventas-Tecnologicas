
package app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class Tienda {
    private List<Producto> productos;
    private List<Fabricante> fabricantes;
    private List<Venta> ventas = new ArrayList<>();

    public Tienda() {
        this.productos = new ArrayList<>();
        this.fabricantes = new ArrayList<>();
        this.ventas = new ArrayList<>();
    }
    
    public void agregarProductos(){
        String nombre = JOptionPane.showInputDialog("Digite nombre del producto");
        String codigo = JOptionPane.showInputDialog("Digite el codigo del producto");
        String tipo = JOptionPane.showInputDialog("Digite el tipo de producto a ingresar");
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Digite el precio del producto a ingresar"));
        Producto producto = new Producto(nombre,codigo,tipo,precio,new ArrayList<>());
        productos.add(producto);
        JOptionPane.showMessageDialog(null, "¡¡¡Producto a sido agregado Exitosamente!!!");   
    }
    private  Fabricante buscarFabricantes(String nombreFabricante){
        for(Fabricante fabricante: fabricantes){
            if(fabricante.getNombre().equalsIgnoreCase(nombreFabricante)){
                return fabricante;
            }
        }
        return null;
    }
    
    public void registrarFabricante(){
        String nombreFabricante = JOptionPane.showInputDialog("Digite nombre del Fabricante a ingresar");
        String pais = JOptionPane.showInputDialog("Digite el pais");
        int añoFundacion = Integer.parseInt(JOptionPane.showInputDialog("Digite el año de Fundacion"));
       
        Fabricante fabricante = new Fabricante(nombreFabricante,pais,añoFundacion);
        fabricantes.add(fabricante);
        JOptionPane.showMessageDialog(null, "¡¡¡Fabricante a sido agregado Exitosamente!!!");   
    }
    
    public void realizarVenta(){
        String codigo = JOptionPane.showInputDialog("Digite el codigo del producto");
        Producto producto = productos.stream()
                .filter(p -> p.getCodigo().equals(codigo))
                .findFirst()
                .orElse(null);
        
        if(producto == null){
            JOptionPane.showMessageDialog(null, "¡¡ Producto no encontrado");
            return;
            
        }
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad vendida"));
        Date fecha = new Date();
        double total = Double.parseDouble(JOptionPane.showInputDialog("Digite el total de la compra"));
        
        Venta venta = new Venta(producto,cantidad,fecha,total);
        ventas.add(venta);
        JOptionPane.showMessageDialog(null, "¡¡¡Venta registrada Exitosamente!!!"); 
        
    }
    
    public double calcularTotalVentas(Date inicio, Date fin) {
        return ventas.stream()
                .filter(venta -> !venta.getFecha().before(inicio) && !venta.getFecha().after(fin))
                .mapToDouble(Venta::getTotal)
                .sum();
    }
}
