
package cr.ac.uisil.clases.modelo;



/**

 * @author Fau
 */

public class Electronico {
    public String tipo;
    public String marca;
    public int precio;
    public int cantidad;
    
    public Electronico(String tipo, String marca, int precio, int cantidad) {
        this.tipo = tipo;   
        this.marca = marca;     
        this.precio = precio;     
        this.cantidad = cantidad;     
    }



    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        
        return marca;
    }

    public void setMarca(String marca) {
        this.marca =marca ;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    

    @Override
    public String toString() {
        
        return "electronico{" + "tipo= " + tipo + ", marca= " + marca + ", precio= " + precio + ", cantidad= " + cantidad + '}';
    }

   



    



   
    
    
}
