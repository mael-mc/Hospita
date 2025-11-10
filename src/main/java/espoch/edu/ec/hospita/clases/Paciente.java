
package espoch.edu.ec.hospita.clases;

public class Paciente {
    private String nombre;
    private String alergia;

    public Paciente(String nombre, String alergia) {
        this.nombre = nombre;
        this.alergia = alergia;
    }

    // Getters
    public String getNombre() { 
        return nombre; 
    }
    public String getAlergia() { 
        return alergia; 
    }
}
