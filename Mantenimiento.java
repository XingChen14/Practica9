public class Mantenimiento {
    public String tipo;
    public String fecha;
    public double costo;

    public Mantenimiento(String tipo, String fecha, double costo) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.costo = costo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public double getCosto() {
        return costo;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + ", Fecha: " + fecha + ", Costo: $" + costo;
    }
}
