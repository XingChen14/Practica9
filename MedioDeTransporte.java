import java.util.*;

abstract class MedioDeTransporte {
    public String nombre;
    public String identificador;
    public int añoCreacion;
    public List<Mantenimiento> historialMantenimientos;

    public MedioDeTransporte(String nombre, String identificador, int añoCresacion){
        this.nombre = nombre;
        this.identificador = identificador;
        this.añoCreacion = añoCresacion;
        this.historialMantenimientos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    public int getAñoCreacion() {
        return añoCreacion;
    }

    public List<Mantenimiento> getHistorialMantenimientos() {
        return historialMantenimientos;
    }

    //Metodo para agrefar mantenimiento
    public void agregarMantenimiento(Mantenimiento mantenimiento) {
        this.historialMantenimientos.add(mantenimiento);
        System.out.println("Se ha registrado un mantenimiento para " + nombre + ": " + mantenimiento);
    }

    public abstract void avanzar();
    public abstract void retroceder();
    public abstract void virar();

}
