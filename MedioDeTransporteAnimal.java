abstract class MedioDeTransporteAnimal extends MedioDeTransporte {
    public MedioDeTransporteAnimal(String nombre, String identificador, int añoCreacion) {
        super(nombre, identificador, añoCreacion);
    }

    public void preparar() {
        System.out.println(getNombre() + " está preparado.");
    }

    public void descansar() {
        System.out.println(getNombre() + " está descansando.");
    }

}
