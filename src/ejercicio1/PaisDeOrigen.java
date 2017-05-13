package ejercicio1;

public class PaisDeOrigen {
    private String idioma;
    private String nombre;
    
    public PaisDeOrigen (){
        
    }
    
    public PaisDeOrigen (String idioma, String nombre){
        this.idioma = idioma;
        this.nombre = nombre;
    }
    
    public void setIdioma (String idioma){
        this.idioma = idioma;
    }
    public String getIdioma (){
        return this.idioma;
    }
     public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public String getNombre (){
        return this.nombre;
    }
}

