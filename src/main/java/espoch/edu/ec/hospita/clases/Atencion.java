
package espoch.edu.ec.hospita.clases;

public class Atencion {
    private String id;
    private Paciente paciente;
    private EstadoAtencion estado;
    private Prioridad prioridad;
    private String motivoCancelacion;
    private Procedimiento procedimiento1;
    private Procedimiento procedimiento2;
    private int contadorProcedimientos;
    private Factura factura;

    public Atencion(String id, Paciente paciente, Prioridad prioridad) {
        this.id = id;
        this.paciente = paciente;
        this.prioridad = prioridad;
        this.estado = EstadoAtencion.REGISTRADA;
        this.contadorProcedimientos = 0;
        this.factura = new Factura();
    }

    public void cambiarEstado(EstadoAtencion nuevoEstado) {
        // Validar regla: Alta requiere ListaParaAlta
        if (nuevoEstado == EstadoAtencion.ALTA_EMITIDA && this.estado != EstadoAtencion.LISTA_PARA_ALTA) {
            throw new IllegalArgumentException("No se puede emitir Alta sin pasar por ListaParaAlta");
        }
        
        // Validar regla: Cancelación solo desde Registrada o EnTriaje
        if (nuevoEstado == EstadoAtencion.CANCELADA && 
            this.estado != EstadoAtencion.REGISTRADA && this.estado != EstadoAtencion.ENTRIAGE) {
            throw new IllegalArgumentException("Solo se puede cancelar desde Registrada o EnTriaje");
        }

        this.estado = nuevoEstado;
    }

    public void cancelar(String motivo) {
        if (motivo == null || motivo.trim().isEmpty()) {
            throw new IllegalArgumentException("Motivo de cancelación es obligatorio");
        }
        this.motivoCancelacion = motivo;
        cambiarEstado(EstadoAtencion.CANCELADA);
    }

    public void agregarProcedimiento(Procedimiento procedimiento) {
        if (contadorProcedimientos == 0) {
            procedimiento1 = procedimiento;
        } else if (contadorProcedimientos == 1) {
            procedimiento2 = procedimiento;
        } else {
            throw new IllegalStateException("Máximo 2 procedimientos por atención");
        }
        contadorProcedimientos++;
        factura.agregarItem(procedimiento.getCosto());
    }

    public int getCantidadProcedimientos() {
        return contadorProcedimientos;
    }

    // Getters
    public String getId() { 
        return id; 
    }
    public Paciente getPaciente() { 
        return paciente; 
    }
    public EstadoAtencion getEstado() { 
        return estado; 
    }
    public Prioridad getPrioridad() { 
        return prioridad; 
    }
    public Factura getFactura() { 
        return factura; 
    }
    public Procedimiento getProcedimiento1() { 
        return procedimiento1; 
    }
    public Procedimiento getProcedimiento2() { 
        return procedimiento2;
    }
}
