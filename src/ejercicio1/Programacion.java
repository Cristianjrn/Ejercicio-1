package ejercicio1;

public class Programacion {
    private String fechaFin;
    private String horaCreada;
    private String fechaInicio;
    
    public Programacion (String fechaFin, String horaCreada, String fechaInicio){
        this.fechaFin = fechaFin;
        this.horaCreada = horaCreada;
        this.fechaInicio = fechaInicio;
    }
    
      public void setFechaFin(String fechaFin){
        this.fechaFin = fechaFin;
    }
    public String getFechaFin(){
        return fechaFin;
    }
      public void setHoraCreada(String horaCreada){
        this.horaCreada = horaCreada;
    }
    public String getHoraCreada(){
        return horaCreada;
    }
     public void setFechaInicio(String fechaInicio){
        this.fechaInicio = fechaInicio;
    }
    public String getFechaInicio(){
        return fechaInicio;
    }    
               
}
