abstract class MedioDeTransporteMecánico extends MedioDeTransporte {
    protected boolean encendido;

    public MedioDeTransporteMecánico(String nombre, String identificador, int añoCreacion) {
        super(nombre, identificador, añoCreacion);
        this.encendido = false;
    }

    public void encender() {
        encendido = true;
        System.out.println(getNombre() + " está encendido.");
    }

    public void apagar() {
        encendido = false;
        System.out.println(getNombre() + " está apagado.");
    }

}
