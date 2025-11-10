
package espoch.edu.ec.hospita.clases;

public class Procedimiento {
    private TipoProcedimiento tipo;
    private String codigo;
    private double costo;
    private String resultados;

    public Procedimiento(TipoProcedimiento tipo, String codigo, double costo) {
        this.tipo = tipo;
        this.codigo = codigo;
        this.costo = costo;
    }

    public void registrarResultados(String resultados) {
        this.resultados = resultados;
    }

    // Getters
    public TipoProcedimiento getTipo() { 
        return tipo; 
    }
    public String getCodigo() { 
        return codigo; 
    }
    public double getCosto() { 
        return costo; 
    }
    public String getResultados() { 
        return resultados;
    }
}
