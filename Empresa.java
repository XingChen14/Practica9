public class Empresa {
    public String nombre;
    public Flota flota;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.flota = new Flota();
    }

    public String getNombre(){
        return nombre;
    }

    public Flota getFlota(){
        return flota;
    }

}