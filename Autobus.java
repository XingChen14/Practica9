public class Autobus extends MedioDeTransporteMecánico{
    public Autobus(String nombre, String identificador, int añoCreacion) {
        super(nombre, identificador, añoCreacion);
    }

    @Override
    public void avanzar() {
        if (encendido) {
            System.out.println("El autobús está avanzando.");
        } else {
            System.out.println("El autobús está apagado. No puede avanzar.");
        }
    }

    @Override
    public void retroceder() {
        if (encendido) {
            System.out.println("El autobús está retrocediendo.");
        } else {
            System.out.println("El autobús está apagado. No puede retroceder.");
        }
    }

    @Override
    public void virar() {
        if (encendido) {
            System.out.println("El autobús está tomando una curva.");
        } else {
            System.out.println("El autobús está apagado. No puede dar curva.");
        }
    }
}
