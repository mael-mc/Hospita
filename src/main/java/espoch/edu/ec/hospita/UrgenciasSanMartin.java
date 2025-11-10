
package espoch.edu.ec.hospita;

import espoch.edu.ec.hospita.clases.Atencion;
import espoch.edu.ec.hospita.clases.Paciente;
import espoch.edu.ec.hospita.clases.Prioridad;
import espoch.edu.ec.hospita.clases.Procedimiento;
import espoch.edu.ec.hospitaenum.EstadoAtencion;
import espoch.edu.ec.hospitaenum.TipoProcedimiento;


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
        
        // Crear paciente
        Paciente paulo = new Paciente();
        paulo.setNombre("Paulo");
        paulo.setAlergia("penicilina");
        
        // Crear atención
        Atencion atencionPaulo = new Atencion();
        atencionPaulo.setId("ATN-001");
        atencionPaulo.setPaciente(paulo);
        atencionPaulo.setPrioridad(Prioridad.ROJO);
        
        // Agregar procedimientos
        Procedimiento ecg = new Procedimiento();
        ecg.setTipo(TipoProcedimiento.ECG);
        ecg.setCodigo("ECG-001");
        ecg.setCosto(150.0);
        
        Procedimiento lab = new Procedimiento();
        lab.setTipo(TipoProcedimiento.LABORATORIO);
        lab.setCodigo("LAB-001");
        lab.setCosto(200.0);
        
        atencionPaulo.agregarProcedimiento(ecg);
        atencionPaulo.agregarProcedimiento(lab);
        
        // Cambiar estados
        atencionPaulo.setEstado(EstadoAtencion.ENTRIAGE);
        atencionPaulo.setEstado(EstadoAtencion.EN_ATENCION);
        atencionPaulo.setEstado(EstadoAtencion.LISTA_PARA_ALTA);
        
        // Aplicar cobertura de seguro (70%)
        atencionPaulo.getFactura().aplicarCobertura(70);
        
        // Emitir alta
        atencionPaulo.setEstado(EstadoAtencion.ALTA_EMITIDA);
        
        System.out.println("Resumen de Atencion:");
        System.out.println("ID: " + atencionPaulo.getId());
        System.out.println("Estado: " + atencionPaulo.getEstado());
        System.out.println("Subtotal: $" + atencionPaulo.getFactura().getSubtotal());
        System.out.println("Cobertura: 70%");
        System.out.println("Descuento: $" + atencionPaulo.getFactura().getDescuentoSeguro());
        System.out.println("TOTAL: $" + atencionPaulo.getFactura().getTotal());
        System.out.println("Atencion completada exitosamente");
    }
}

