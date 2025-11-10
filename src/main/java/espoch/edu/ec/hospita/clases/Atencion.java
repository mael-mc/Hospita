
package espoch.edu.ec.hospita.clases;

import espoch.edu.ec.hospitaenum.EstadoAtencion;
import espoch.edu.ec.hospitaenum.Prioridad;

public class Atencion {
  private String id;
    private Paciente paciente;
    private EstadoAtencion estado;
    private Prioridad prioridad;
    private Procedimiento procedimiento1;
    private Procedimiento procedimiento2;
    private int contadorProcedimientos;
    private Factura factura;

    public Atencion() {
        this.estado = EstadoAtencion.REGISTRADA;
        this.contadorProcedimientos = 0;
        this.factura = new Factura();
    }

    public void cambiarEstado(EstadoAtencion nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public void cancelar(String motivo) {
        this.estado = EstadoAtencion.CANCELADA;
    }

    public void agregarProcedimiento(Procedimiento procedimiento) {
        if (contadorProcedimientos == 0) {
            procedimiento1 = procedimiento;
            factura.agregarItem(procedimiento.getCosto());
        } else if (contadorProcedimientos == 1) {
            procedimiento2 = procedimiento;
            factura.agregarItem(procedimiento.getCosto());
        }
        contadorProcedimientos++;
    }

    // Getters y Setters
    public String getId() { 
        return id; 
    }
    public void setId(String id) { 
        this.id = id; 
    }
    
    public Paciente getPaciente() { 
        return paciente; 
    }
    public void setPaciente(Paciente paciente) { 
        this.paciente = paciente;
    }
    
    public EstadoAtencion getEstado() { 
        return estado;
    }
    public void setEstado(EstadoAtencion estado) { 
        this.estado = estado;
    }
    
    public Prioridad getPrioridad() { 
        return prioridad;
    }
    public void setPrioridad(Prioridad prioridad) { 
        this.prioridad = prioridad;
    }
    
    public Factura getFactura() { 
        return factura;
    }
    public void setFactura(Factura factura) { 
        this.factura = factura;
    }
    
    public int getCantidadProcedimientos() { 
        return contadorProcedimientos;
    }
    public void setCantidadProcedimientos(int contadorProcedimientos) { 
        this.contadorProcedimientos = contadorProcedimientos;
    }
    
    public Procedimiento getProcedimiento1() { 
        return procedimiento1;
    }
    public void setProcedimiento1(Procedimiento procedimiento1) { 
        this.procedimiento1 = procedimiento1;
    }
    
    public Procedimiento getProcedimiento2() { 
        return procedimiento2;
    }
    public void setProcedimiento2(Procedimiento procedimiento2) { 
        this.procedimiento2 = procedimiento2;
    }
}
