package cr.ac.uisil.clases.controlador;



import cr.ac.uisil.clases.modelo.Electronico;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


/**
 
 * @author Fau
 */
public class Tienda {
 
    private static Electronico[] elec= new Electronico[1];
    private static int[] ventas= new int[1];

  
    public static void main(String[] args) {
        int men;
     
        do{
            
               System.out.println("  ");
            System.out.println("     Gestion de inventario ");
            System.out.println("Seleccione 1 para Añador electronico");
            System.out.println("Seleccione 2 para Modificar precio de venta");
            System.out.println("Seleccione 3 para Realizar venta");
            System.out.println("Seleccione 4 para Reportes");
            System.out.println("Seleccione 5 para Salir");
                Scanner esca= new Scanner(System.in);
                men= esca.nextInt();
    switch (men){
        case 1:
        
            añadir();
                break;
        case 2:
            modificar();
                break;
        case 3:  
            venta();
                break;
        case 4:     
            Reportes();
                break;
                }
        }while(men!=5);
         
    }
   
    
    public static void añadir(){
         System.out.print(" ");
          int num= elec.length;
           Scanner es= new Scanner(System.in);   
        for (int i = num-1; i <num ; i++) {
           elec[i]= new Electronico(" ", " ", 0, 0);
            System.out.println("Tipo de electronico");
           elec[i].setTipo(es.nextLine());
            System.out.println("Marca de electronico");
           elec[i].setMarca(es.nextLine());
            System.out.println("Precio de electronico");
           elec[i].setPrecio(es.nextInt());
            System.out.println("Cantidad de electronico");
           elec[i].setCantidad(es.nextInt());
       System.out.println(elec[i]);
    }
        Electronico[] new_elec=new Electronico[elec.length+1];
        System.arraycopy(elec, 0, new_elec, 0, elec.length);
        elec= new Electronico[elec.length+1];
        System.arraycopy(new_elec, 0, elec, 0, elec.length);
       
      
    }

    public static void modificar(){    
        System.out.print(" ");
    Scanner modi= new Scanner(System.in); 
    int mod = 0;
        System.out.println("");
     for (int i = 0; i < elec.length-1; i++) {
            System.out.println(i+" "+elec[i]);
     }   
        System.out.println(" Ingrese el numero de electronico al que desea cambiarle el precio");
        mod=modi.nextInt();
        System.out.println("Ingrese su nuevo precio");
       elec[mod].setPrecio(modi.nextInt());
        System.out.println("El electronicoen la posicion "+mod+" a modificado su precio a: "+elec[mod].getPrecio());
    }
    
    public static void venta(){
          System.out.print(" ");
    Scanner ve= new Scanner(System.in); 
     
     for (int i = 0; i < elec.length-1; i++) {
            System.out.println(i+" "+elec[i]);
     }   
        System.out.println(" Ingrese el numero de electronico que desea vender");
        int ven=ve.nextInt();
        System.out.println("Ingrese la cantidad de electroncos requeridos");
        int vent=ve.nextInt();
       
       while(elec[ven].getCantidad()>=vent ){
            int cant = 0;  
            
           cant= elec[ven].getCantidad()-vent;
           elec[ven].setCantidad(cant);
           System.out.println("La venta ha sido exitosa"); 
           
           for (int i =ventas.length-1 ; i < ventas.length; i++) {
            ventas[i]= (elec[ven].getPrecio()*vent);
        }
                 int[] new_ventas= new int[ventas.length+1];   
                 System.arraycopy(ventas, 0, new_ventas, 0, ventas.length);
                 ventas= new int[ventas.length+1];
                 System.arraycopy(new_ventas, 0, ventas, 0, ventas.length );
           return;
       }if(elec[ven].getCantidad()<vent){
           System.out.println("No hay suficientes en stock, solo quedan disponibles: "+elec[ven].getCantidad());
       } 

      
    }
    
    public static void Reportes(){
        System.out.println(" ");
        System.out.println("     Listado de electrónicos: ");
        for (int i = 0; i < elec.length-1; i++) {
          
            System.out.println(i+" "+elec[i]);
            
        }
        System.out.println(" ");
        System.out.println("     Listado de ventas: ");
        Arrays.sort(ventas);
        for (int i = ventas.length-1; i >=1; i--) {
            System.out.println("Monto: "+ventas[i]);
        }
        System.out.println(" ");
       
        System.out.println("     Electronico más caro: ");
          }       
            
           
        
    }

   
