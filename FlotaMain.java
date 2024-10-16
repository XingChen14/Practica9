public class FlotaMain {
    public static void main(String[] args) {
        // Crear la empresa "Turistas Felices"
        Empresa empresa = new Empresa("Turistas Felices");

        // Crear medios de transporte
        Autobus autobus = new Autobus("Autobús Turístico", "AB09", 2019);
        Caballo caballo = new Caballo("Caballo de Paseo", "CB001", 2020);
        Bicicleta bicicleta = new Bicicleta("Bicicleta Urbana", "BC004", 2019);
        VehiculoTodoterreno todoterreno = new VehiculoTodoterreno("Jeep Compass 4x4", "VT789", 2022);
        Avion avion = new Avion("Avión Paracaidismo", "AV007", 2020);

        // Crear mantenimientos
        Mantenimiento mantenimientoAutobus = new Mantenimiento("Revisión general", "2024-10-05", 1000.00);
        Mantenimiento mantenimientoCaballo = new Mantenimiento("Chequeo veterinario", "2024-10-05", 300.00);
        Mantenimiento mantenimientoBicicleta = new Mantenimiento("Cambio de llantas", "2024-10-05", 150.00);
        Mantenimiento mantenimientoTodoterreno = new Mantenimiento("Reparación de suspensión", "2024-10-05", 1200.00);
        Mantenimiento mantenimientoAvion = new Mantenimiento("Inspección de motor", "2024-10-05", 5000.00);

        // Registrar mantenimientos
        autobus.agregarMantenimiento(mantenimientoAutobus);
        caballo.agregarMantenimiento(mantenimientoCaballo);
        bicicleta.agregarMantenimiento(mantenimientoBicicleta);
        todoterreno.agregarMantenimiento(mantenimientoTodoterreno);
        avion.agregarMantenimiento(mantenimientoAvion);

        // Agregar medios a la flota
        empresa.getFlota().agregarMedio(autobus);
        empresa.getFlota().agregarMedio(caballo);
        empresa.getFlota().agregarMedio(bicicleta);
        empresa.getFlota().agregarMedio(todoterreno);
        empresa.getFlota().agregarMedio(avion);

        // Probar métodos
        autobus.encender();
        autobus.avanzar();
        autobus.virar();
        autobus.retroceder();
        autobus.apagar();

        caballo.preparar();
        caballo.avanzar();
        caballo.virar();
        caballo.descansar();

        bicicleta.avanzar();
        bicicleta.virar();
        bicicleta.retroceder();

        todoterreno.encender();
        todoterreno.avanzar();
        todoterreno.virar();
        todoterreno.retroceder();
        todoterreno.apagar();

        avion.encender();
        avion.avanzar();
        avion.virar();
        avion.retroceder();
        avion.apagar();

        // Mostrar medios en la flota
        System.out.println("Cantidad de medios en la flota de 'Turistas Felices': " + empresa.getFlota().cantidadMedios());
    }
}
