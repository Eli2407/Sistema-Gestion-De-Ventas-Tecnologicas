
package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class GestionVentas {
     public static void main(String[] args) {
        Tienda tienda = new Tienda();
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        while(true){
            String[] opciones = {
                "Agregar Producto",
                "Registrar Fabricantes",
                "Realizar Venta",
                "Calcular costo Total de venta en un periodo",
                "salir"
            };
            
            String seleccion = (String) JOptionPane.showInputDialog(null,"Seleccione una opcion",
                    "Sistema de Gestion de Ventas Electronicas",JOptionPane.QUESTION_MESSAGE,null,
                    opciones,opciones[0]);
            
            if(seleccion == null || seleccion.equals("salir")){
                break;
            }
            switch(seleccion){
                case "Agregar Producto":
                    tienda.agregarProductos();
                    break;
                    
                case "Registrar Fabricantes":
                    tienda.registrarFabricante();
                    break;
                case "Realizar Venta":
                    tienda.realizarVenta();
                    break;
                case "Calcular costo Total de venta en un periodo":
                       try {
                        String fechaInicioStr = JOptionPane.showInputDialog("Ingrese la fecha de inicio (dd/MM/yyyy):");
                        String fechaFinStr = JOptionPane.showInputDialog("Ingrese la fecha de fin (dd/MM/yyyy):");
                        Date fechaInicio = sdf.parse(fechaInicioStr);
                        Date fechaFin = sdf.parse(fechaFinStr);
                        double totalVentas = tienda.calcularTotalVentas(fechaInicio, fechaFin);
                        JOptionPane.showMessageDialog(null, "Total de ventas en el período: " + totalVentas);
                    } catch (ParseException e) {
                        JOptionPane.showMessageDialog(null, "Error al ingresar las fechas. Asegúrese de usar el formato correcto (dd/MM/yyyy).");
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Cuidado¡¡¡ Opcion no Valida");
                    break;
            }
           
        }
         JOptionPane.showMessageDialog(null, "Gracias por usar el Sistema de Gestion de Ventas de Computadores y Tecnologia");
    }
}
