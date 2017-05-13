
import java.util.Date;

public class Pelicula {
    private String nombrePelicula;
    private int duracion;
    private boolean disponible;
    private Date fechaIngreso;
    private Genero genero;
    
    public Pelicula(){
        
    }
    public Pelicula(  String nombrePelicula, int duracion, boolean disponible, Date fechaIngreso)
    { 
        this.nombrePelicula = nombrePelicula;
        this.disponible = disponible;
        
    }
    public void setNombrePelicula( String nombrePelicula){
        this.nombrePelicula= nombrePelicula;
        
    }
    
    public String getNombrePelicula(){
        return this.nombrePelicula;
    }
    
}
