# LlanquihueTourApp

Sistema de gestion de servicios turisticos para la agencia Llanquihue Tour, desarrollado en Java aplicando programacion orientada a objetos.

## Descripcion del avance (Semana 7)

Esta semana se extendio la jerarquia de clases construida previamente (`ServicioTuristico`, `RutaGastronomica`, `PaseoLacustre`, `ExcursionCultural`) para aplicar polimorfismo y colecciones genericas. Los cambios principales fueron:

- Se ajusto el metodo `mostrarInformacion()` de la superclase `ServicioTuristico` para que sea accesible publicamente y pueda invocarse desde cualquier clase que recorra la coleccion.
- Cada subclase (`RutaGastronomica`, `PaseoLacustre`, `ExcursionCultural`) sobrescribe `mostrarInformacion()` con la anotacion `@Override`, mostrando la informacion especifica de cada tipo de servicio.
- La clase `GestorServicios` (paquete `data`) crea y almacena seis instancias de servicios turisticos, combinando las tres subclases, en una coleccion `List<ServicioTuristico>`.
- La clase `Main` (paquete `ui`) recorre la coleccion completa con un bucle for-each usando una referencia de tipo `ServicioTuristico` e invoca `mostrarInformacion()` sobre cada elemento. El comportamiento mostrado en consola varia segun el tipo real de cada objeto gracias al polimorfismo (dispatch dinamico), sin necesidad de usar `instanceof` ni conversiones de tipo.

## Estructura del proyecto

```
src/
  com/puertogames/
    model/
      ServicioTuristico.java
      RutaGastronomica.java
      PaseoLacustre.java
      ExcursionCultural.java
    data/
      GestorServicios.java
    ui/
      Main.java
```

## Requisitos

- JDK 17 o superior instalado.

## Como compilar y ejecutar

### Desde linea de comandos

1. Ubicarse en la carpeta raiz del proyecto (la que contiene la carpeta `src`).
2. Compilar todas las clases:

```
javac -d out $(find src -name "*.java")
```

En Windows (PowerShell), usar en su lugar:

```
javac -d out (Get-ChildItem -Recurse -Filter *.java src | ForEach-Object { $_.FullName })
```

3. Ejecutar el programa:

```
java -cp out com.puertogames.ui.Main
```

### Desde un IDE (IntelliJ IDEA, Eclipse, NetBeans)

1. Abrir el proyecto en el IDE.
2. Ubicar la clase `Main` dentro del paquete `com.puertogames.ui`.
3. Ejecutar `Main` (Run).

## Salida esperada

Por consola se listan los seis servicios turisticos (dos rutas gastronomicas, dos paseos lacustres y dos excursiones culturales), cada uno mostrando su informacion especifica segun su tipo real, aunque todos fueron recorridos a traves de una referencia comun de tipo `ServicioTuristico`.
