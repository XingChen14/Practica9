PROJECT TITLE: 
Práctica 9 Polimorfismo

PURPOSE OF PROJECT: Analizar y diseñar una solución orientada a objetos utilizando polimorfismo en una jerarquía de clases para modelar un dominio complejo, con actitud reflexiva y crítica.

VERSION or DATE: Version 1 (09/10/2024)

HOW TO START THIS PROJECT:

AUTHORS: Ana Chen Zhang

USER INSTRUCTIONS:
    La empresa "Turistas Felices" ofrece una variedad de recorridos turísticos a sus clientes. Su flota consta de diversos medios de transporte adecuados para cada tipo de actividad, por ejemplo: autobuses para visitas entre ciudades, caballos para paseos en el campo, bicicletas para paseos urbanos, vehículos todoterreno para paseos extremos y aviones para aventuras de paracaidismo. Cada tipo de medio de transporte tiene características únicas que deben ser consideradas al planificar los paseos.


ACTIVITIES:
    Crear la clase Empresa, la cual tendrá datos generales y contendrá una clase Flota.

    Crear la clase Flota, la cual  deberá tener métodos para agregar medio de transporte, eliminar medio de transporte, retornar la lista de los medios de transporte que son parte de ella y retornar la cantidad de medios de transporte de la flota.

    Crear una clase MedioDeTransporte que tenga nombre, identificador, año de creación y un historial de los servicios de mantenimiento realizados. Definir los métodos necesarios para definir y actualizar los datos, dependiendo de si los atributos son mutables o inmutables. Además los métodos para avanzar, retroceder y virar.

    Crear una clase Mantenimiento  que estará asociada a los  medios de transporte. Tendrá el tipo de mantenimiento, la fecha y el costo.

    Crear la subclase MedioDeTransporteMecánico y MedioDeTransporteAnimal.
    
    Crear las subclases restantes para representar todos los medios de transporte identificados en la descripción del problema. 
    Para poder avanzar, retroceder o virar, el transporte mecánico necesitará métodos de encendido y apagado y el transporte animal necesitará métodos preparar y descansar. 
    Sobrecargar los métodos necesarios de cada subclase para que sean especializados, por ejemplo no debe ser la misma implementación de virar() en un barco que en un avión en un autobús o en un caballo. De la misma manera, una bicicleta no enciende y la forma de encender un autobús es diferente a encender un avión.
    También considerar la sobreescritura de métodos en el caso de requerir varias versiones de un mismo método con diferentes parámetros, por ejemplo, a la flota se le puede agregar un medio de transporte o una lista de medios de transporte o en el caso del historial de mantenimientos, se puede agregar un mantenimiento o una lista de ellos.

    Mostrar el funcionamiento de todas las clases creando una clase llamada FlotaMain, en la cual se deberá crear una flota con al menos un medio de transporte de cada tipo y se deberán invocar todos los métodos de cada una de las clases creadas. Se debe probar el método para agregar un medio de transporte y agregar una lista de medios de transporte a la flota. A cada medio de transporte creado se le debe registrar un mantenimiento y una lista de mantenimientos para probar los métodos que aceptan ambos tipos de parámetros.

    Versionar el código en un nuevo repositorio y subir el código a GitHub como practica9

    Si se entrega después de la hora límite, se tiene que realizar un video para explicar el funcionamiento del programa y que permita evaluar el nivel de conocimiento que tienen del código presentado.

    Entregar por classroom la URL del repositorio de código en GitHub, y en caso de entrega tardía, entregar también el enlace al video explicando el funcionamiento.



DELIVERY:
    Entregar el enlace al repositorio de GitHub y 
    en caso de entrega tardía, entregar también el enlace al video explicando el funcionamiento.


EVALUATION CRITERIA
    Correcta implementación de las clases, atributos, constructores y métodos.
    Funcionalidad del programa.
    Estructura y organización del código.
    Legibilidad del código (indentación, nombrado de variables, comentarios y documentación).
    Uso adecuado de encapsulamiento, herencia y polimorfismo.

