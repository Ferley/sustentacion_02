/*
  and open the template in the editor.
 */
package sustentacion;

import java.util.Scanner;

/**
 *
 * @author Ferley
 */
public class Sustentacion {

    /**
     * @param args the command line arguments
     */
    static String nombre;
    static int cantidadven,borrar,aux,venta;
    static double precio,ganancia,gananciatotal;
    static inventario arrayObjetos[];
    public static void main(String[] args) {
        int opc,con=0,t;
        inventario arrayObjetos[]=new inventario[10];
    
    for (int i=0;i<arrayObjetos.length;i++){
        arrayObjetos[i]=new inventario();
    }
   
   Scanner lector = new Scanner(System.in);
    
        do {
            System.out.println("Digite la opcion");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Buscar Producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar Inventario");
            System.out.println("5. Realizar Venta");
            System.out.println("6. Consultar saldo");
            System.out.println("7. Mostrar Ganancias totales");
            System.out.println("0. Salir");
            opc = lector.nextInt();
           
            switch (opc) {
                
                case 1: arrayObjetos[con].agregar_producto();
                      con=con++;  
                    break;
                case 2: buscar_producto(con);                        
                    break;
                case 3:eliminar_producto(con);
                        con=con--;
                    break;
                case 4: mostrar_inventario(con);
                    break;
                case 5: realizar_ventas(con);
                    break;
                case 6:mostrar_ganancias(con);
                    break; 
                   
            }
        
        }while (opc!=0);
            
    }
    
    public static void buscar_producto(int con){
        Scanner lector = new Scanner(System.in);
        System.out.println("Digite el nombre del producto");
        nombre = lector.next();
        for (int i=0;i<con;i++){
            if(arrayObjetos[i].getNombre().equals(nombre)){
                System.out.println("El nombre es "+arrayObjetos[i].getNombre());
                System.out.println("la cantidad es"+arrayObjetos[i].getCantidad());
                System.out.println("el precio es"+arrayObjetos[i].getPrecio());
            }else{
                System.out.println("no existe el produto");
                }
        }
    }
    public static void eliminar_producto(int con){
       Scanner lector = new Scanner(System.in);
        System.out.println("Digite el nombre del producto");
        nombre = lector.next();
        for (int i=0;i<con;i++){
            if(arrayObjetos[i].getNombre().equals(nombre)){
                borrar=i;
                
                for (int borrar=i;borrar<con;borrar++){
                arrayObjetos[borrar]=arrayObjetos[borrar+1];
                }
            }else{
                System.out.println("no existe el produto");
                }
        } 
        
     }
    
    public static void mostrar_inventario(int con){
        for (int i=0;i<con;i++){
            System.out.println("El nombre del producto es"+arrayObjetos[i].getNombre());
            System.out.println("La cantidad del producto es"+arrayObjetos[i].getCantidad());
            System.out.println("El precio del producto es"+arrayObjetos[i].getPrecio());
            
        } 
     }
     public static void realizar_ventas(int con){
        Scanner lector = new Scanner(System.in);
        System.out.println("Digite el nombre del producto");
        nombre = lector.next();
        for (int i=0;i<con;i++){
            if(arrayObjetos[i].getNombre().equals(nombre)){
                System.out.println("Digite la cantidad");
                cantidadven = lector.nextInt();
                aux=arrayObjetos[i].getCantidad();
                aux=aux-cantidadven;
                arrayObjetos[i].setCantidad(aux);
                cantidadven=cantidadven+arrayObjetos[i].getVentas();
                arrayObjetos[i].setVentas(cantidadven);
                
        }
            
     }
    
        
     }
     /*Mostrar Ganancias Totales: Se visualizará cada uno de los productos con la cantidad de
ventas de cada producto y el valor total de la venta, finalmente muestra el valor total de lo que ha
vendido. */
     public static void mostrar_ganancias(int con){
        for (int i=0;i<con;i++){
            System.out.println("El nombre del producto es"+arrayObjetos[i].getNombre());
            System.out.println("La cantidad del producto es"+arrayObjetos[i].getCantidad());
            System.out.println("El precio del producto es"+arrayObjetos[i].getPrecio());
            System.out.println("La cantidad de ventas es"+arrayObjetos[i].getVentas());    
            System.out.println("La cantidad de ganancia del articulo es"+arrayObjetos[i].getVentas()*arrayObjetos[i].getPrecio());    
            for (int t=0;t<con;t++){
                gananciatotal=arrayObjetos[t].getVentas()*arrayObjetos[t].getPrecio();
            }
            System.out.println("La cantidad total de ganancias es"+gananciatotal);
        } 
     }
}

