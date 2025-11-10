
package espoch.edu.ec.hospita.clases;

import espoch.edu.ec.hospitaenum.TipoProcedimiento;

public class Procedimiento {
    private TipoProcedimiento tipo;
    private String codigo;
    private double costo;

    public Procedimiento() {
    }

    // Getters y Setters
    public TipoProcedimiento getTipo() { 
        return tipo;
    }
    public void setTipo(TipoProcedimiento tipo) { 
        this.tipo = tipo;
    }
    
    public String getCodigo() { 
        return codigo;
    }
    public void setCodigo(String codigo) { 
        this.codigo = codigo;
    }
    
    public double getCosto() { 
        return costo;
    }
    public void setCosto(double costo) { 
        this.costo = costo;
    }
}
