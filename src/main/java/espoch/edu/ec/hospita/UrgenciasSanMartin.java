
package espoch.edu.ec.hospita;

import espoch.edu.ec.hospita.clases.Atencion;
import espoch.edu.ec.hospita.clases.EstadoAtencion;
import espoch.edu.ec.hospita.clases.Paciente;
import espoch.edu.ec.hospita.clases.Prioridad;
import espoch.edu.ec.hospita.clases.Procedimiento;
import espoch.edu.ec.hospita.clases.TipoProcedimiento;


public class UrgenciasSanMartin {

    public static void main(String[] args) {
        System.out.println(" Urgencias Hospitalarias San Martin ");
        System.out.println("Turno de madrugada");
        
        // Caso Paulo
        System.out.println("Atencion de Emergencia:");
        System.out.println("Paciente: Paulo");
        System.out.println("Sintoma: dolor toracico");
        System.out.println("Prioridad: " + Prioridad.ROJO);
        System.out.println("Alergia: penicilina");
        
        // Crear paciente y atención
        Paciente paulo = new Paciente("Paulo", "penicilina");
        Atencion atencionPaulo = new Atencion("ATN-001", paulo, Prioridad.ROJO);
        
        // Agregar procedimientos
        Procedimiento ecg = new Procedimiento(TipoProcedimiento.ECG, "ECG-001", 150.0);
        Procedimiento lab = new Procedimiento(TipoProcedimiento.LABORATORIO, "LAB-001", 200.0);
        
        atencionPaulo.agregarProcedimiento(ecg);
        atencionPaulo.agregarProcedimiento(lab);
        
        // Flujo de estados
        atencionPaulo.cambiarEstado(EstadoAtencion.ENTRIAGE);
        atencionPaulo.cambiarEstado(EstadoAtencion.EN_ATENCION);
        atencionPaulo.cambiarEstado(EstadoAtencion.LISTA_PARA_ALTA);
        
        // Aplicar cobertura
        atencionPaulo.getFactura().aplicarCobertura(70);
        atencionPaulo.cambiarEstado(EstadoAtencion.ALTA_EMITIDA);
        
        System.out.println("Resumen de Atencion");
        System.out.println("ID: " + atencionPaulo.getId());
        System.out.println("Estado: " + atencionPaulo.getEstado());
        System.out.println("Subtotal: $" + atencionPaulo.getFactura().getSubtotal());
        System.out.println("Cobertura: 70%");
        System.out.println("Descuento: $" + atencionPaulo.getFactura().getDescuentoSeguro());
        System.out.println("TOTAL: $" + atencionPaulo.getFactura().getTotal());
        System.out.println("Atencion completada exitosamente");
    }
}

