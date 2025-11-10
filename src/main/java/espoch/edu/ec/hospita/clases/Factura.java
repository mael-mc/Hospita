
package espoch.edu.ec.hospita.clases;

public class Factura {
    private double subtotal;
    private double descuentoSeguro;
    private double total;
    private boolean coberturaAplicada;

    public Factura() {
        this.subtotal = 0;
        this.total = 0;
        this.coberturaAplicada = false;
    }

    public void agregarItem(double costo) {
        this.subtotal += costo;
        this.total = this.subtotal;
    }

    public void aplicarCobertura(double porcentaje) {
        if (!coberturaAplicada) {
            this.descuentoSeguro = this.subtotal * (porcentaje / 100);
            this.total = this.subtotal - this.descuentoSeguro;
            this.coberturaAplicada = true;
        }
    }

    // Getters y Setters
    public double getTotal() { 
        return total;
    }
    public void setTotal(double total) { 
        this.total = total;
    }
    
    public double getSubtotal() { 
        return subtotal;
    }
    public void setSubtotal(double subtotal) { 
        this.subtotal = subtotal;
    }
    
    public double getDescuentoSeguro() { 
        return descuentoSeguro;
    }
    public void setDescuentoSeguro(double descuentoSeguro) { 
        this.descuentoSeguro = descuentoSeguro;
    }
    
    public void setCoberturaAplicada(boolean coberturaAplicada) { 
        this.coberturaAplicada = coberturaAplicada;
    }
}
