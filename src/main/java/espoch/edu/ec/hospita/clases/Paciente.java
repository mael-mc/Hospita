
package espoch.edu.ec.hospita.clases;

public class Paciente {
    
    private String nombre;
    private String alergia;

    public Paciente() {
    }

    // Getters y Setters
    public String getNombre() { 
        return nombre;
    }
    public void setNombre(String nombre) { 
        this.nombre = nombre;
    }
    
    public String getAlergia() { 
        return alergia;
    }
    public void setAlergia(String alergia) { 
        this.alergia = alergia;
    }
}
