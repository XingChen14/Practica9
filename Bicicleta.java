public class Bicicleta extends MedioDeTransporteMecánico {
    public Bicicleta(String nombre, String identificador, int añoCreacion) {
        super(nombre, identificador, añoCreacion);
    }

    @Override
    public void avanzar() {
        System.out.println("La bicicleta está avanzando por la ciudad.");
    }

    @Override
    public void retroceder() {
        System.out.println("La bicicleta está retrocediendo.");
    }

    @Override
    public void virar() {
        System.out.println("La bicicleta está tomando una curva.");
    }

    // La bicicleta no se "enciende" ni se "apaga", sobrecargamos los métodos
    @Override
    public void encender() {
        System.out.println("La bicicleta no necesita ser encendida.");
    }

    @Override
    public void apagar() {
        System.out.println("La bicicleta no necesita ser apagada.");
    }
}
