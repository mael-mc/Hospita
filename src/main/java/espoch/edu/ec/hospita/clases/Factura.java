
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
        if (coberturaAplicada) {
            throw new IllegalStateException("La cobertura de seguro ya fue aplicada");
        }
        
        this.descuentoSeguro = this.subtotal * (porcentaje / 100);
        this.total = this.subtotal - this.descuentoSeguro;
        this.coberturaAplicada = true;
    }

    // Getters
    public double getTotal() { 
        return total; 
    }
    public double getSubtotal() { 
        return subtotal; 
    }
    public double getDescuentoSeguro() { 
        return descuentoSeguro;
    }
    public boolean isCoberturaAplicada() { 
        return coberturaAplicada; 
    }
}
