/*
1. Agregar Producto: Se debe almacenar el nombre del producto, se almacena la cantidad
de productos y se almacena el valor individual del producto.
2. Buscar Producto: Se digita el nombre del producto y se busca, si lo encuentra debe visualizar el
nombre del producto, la cantidad y el valor si no lo encuentra mostrara un mensaje anunciando
que el producto no existe.
3. Eliminar Producto: Se digita el nombre del producto y se busca, si lo encuentra lo elimina junto
con su valor y su cantidad, si no lo encuentra mostrara un mensaje anunciando que el producto
no existe.
4. Mostrar Inventario: Permite visualizar todos los productos, con sus cantidades y precios.
5. Realizar ventas: Se debe digitar el nombre del producto, si lo encuentra, se le solicitara
al usuario la cantidad que desea vender, este dato debe quedar almacenado.
6. Mostrar Ganancias Totales: Se visualizará cada uno de los productos con la cantidad de
ventas de cada producto y el valor total de la venta, finalmente muestra el valor total de lo que ha
vendido. 
 */
package sustentacion;

import java.util.Scanner;

/**
 *
 * @author Ferley
 */
public class inventario {
    String nombre;
    int cantidad,ventas=0;
    double precio;
    Scanner lector = new Scanner(System.in);
    public void agregar_producto(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Digite el nombre del producto");
        nombre = lector.next();
        System.out.println("Digite la cantidad del producto");
        cantidad=lector.nextInt();
         System.out.println("Digite el precio del producto");
        precio=lector.nextDouble();
        
     }
    
    
    public String getNombre() {
        return nombre;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
    
   
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
         
    
    
   
    
   
                                          
                   
}
