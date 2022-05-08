
package modelo;


public class Descripcion {
   String cadena;
   String descripcion;

    public Descripcion(String cadena) {
        this.cadena = cadena;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public String getDescripcion() {
        descripcion = "respuesta";
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "descripcion{" + "cadena=" + cadena + ", descripcion=" + descripcion + '}';
    }
   
   
   
   
   
}
