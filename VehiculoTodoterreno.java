public class VehiculoTodoterreno extends MedioDeTransporteMecánico {
    public VehiculoTodoterreno (String nombre, String identificador, int añoCreacion) {
        super(nombre, identificador, añoCreacion);
    }

    @Override
    public void avanzar() {
        if (encendido) {
            System.out.println("El vehículo todoterreno está avanzando en terreno extremo.");
        } else {
            System.out.println("El vehículo todoterreno está apagado. No puede avanzar.");
        }
    }

    @Override
    public void retroceder() {
        if (encendido) {
            System.out.println("El vehículo todoterreno está retrocediendo.");
        } else {
            System.out.println("El vehículo todoterreno está apagado. No puede retroceder.");
        }
    }

    @Override
    public void virar() {
        System.out.println("El vehículo todoterreno está tomando una curva.");
    }
}
