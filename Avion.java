public class Avion extends MedioDeTransporteMecánico {
    public Avion (String nombre, String identificador, int añoCreacion) {
        super(nombre, identificador, añoCreacion);
    }

    @Override
    public void avanzar() {
        if (encendido) {
            System.out.println("El avión está despegando para una aventura de paracaidismo.");
        } else {
            System.out.println("El avión está apagado. No puede despegar.");
        }
    }

    @Override
    public void retroceder() {
        if (encendido) {
            System.out.println("El avión está retrocediendo en la pista.");
        } else {
            System.out.println("El avión está apagado. No puede retroceder.");
        }
    }

    @Override
    public void virar() {
        System.out.println("El avión está girando en el aire.");
    }
}
