package ejercicio1;

public class Personaje {
    private String nombreEnPelicula;
    
    public Personaje (){
        
    }
    
    public Personaje (String nombreEnPelicula){
        this.nombreEnPelicula = nombreEnPelicula;
    }
    
    public void setNombreEnPelicula(String nombreEnPelicula){
        this.nombreEnPelicula = nombreEnPelicula;
    }
    public String getNombreEnPelicula(){
        return this.nombreEnPelicula;
    }
    
    
}
