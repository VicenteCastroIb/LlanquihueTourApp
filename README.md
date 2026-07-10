# LlanquihueTourApp

Sistema de gestion para la agencia de turismo **Llanquihue Tour**, desarrollado en Java aplicando programacion orientada a objetos (herencia, polimorfismo, interfaces y colecciones genericas).

## Descripcion del avance (Semana 8)

Esta semana se amplio el sistema para gestionar nuevas entidades de la agencia (guias turisticos, vehiculos y colaboradores externos), incorporando una interfaz de comportamiento comun, validacion de tipos en tiempo de ejecucion y una interfaz grafica de usuario.

Cambios principales:

* Se crea la interfaz `Registrable`, con el metodo `mostrarResumen()`, como contrato comun para todas las entidades gestionables del sistema.
* Se crea la clase abstracta `RecursoAgencia` (nombre, correo) como superclase comun.
* Tres subclases implementan `Registrable` y extienden `RecursoAgencia`: `GuiaTuristico`, `ColaboradorExterno` y `Vehiculo`, cada una con su propia version de `mostrarResumen()`.
* La clase `GestorEntidades` (paquete `data`) almacena las entidades en una coleccion generica `ArrayList<Registrable>`, la recorre con for-each y usa `instanceof` para aplicar logica diferenciada segun el tipo real de cada objeto (por ejemplo, marcar a un guia como "senior" segun sus tours realizados).
* Se incorpora una interfaz grafica (paquete `ui`) que permite ingresar nuevas entidades y visualizar el listado completo:
    * `VentanaPrincipalFrame`: version basada en `JFrame`, con el formulario de ingreso y el listado de entidades registradas en la misma ventana principal, actualizandose al instante cada vez que se registra algo nuevo (sin abrir ventanas ni dialogos adicionales).

### Sobre la jerarquia de la Semana 7

La jerarquia de servicios turisticos construida en la semana anterior (`ServicioTuristico`, `RutaGastronomica`, `PaseoLacustre`, `ExcursionCultural`, junto con su gestor) se conserva en el repositorio para mantener la continuidad del proyecto, pero se reubico en el subpaquete `model.servicios` para separarla claramente de la jerarquia nueva de esta entrega (`Registrable` / `RecursoAgencia`). No se modifico su logica ni su comportamiento.

## Estructura del proyecto

```
src/main/java/
  com/puertogames/
    model/
      Registrable.java
      RecursoAgencia.java
      GuiaTuristico.java
      ColaboradorExterno.java
      Vehiculo.java
      servicios/
        ServicioTuristico.java
        RutaGastronomica.java
        PaseoLacustre.java
        ExcursionCultural.java
    data/
      GestorEntidades.java
    ui/
      Main.java
      VentanaPrincipal.java
      VentanaPrincipalFrame.java
```

## Requisitos

* JDK 17 o superior instalado.

## Como compilar y ejecutar

### Desde linea de comandos

1. Ubicarse en la carpeta raiz del proyecto (la que contiene `src/main/java`).
2. Compilar todas las clases:

```
javac -d out $(find src/main/java -name "*.java")
```

En Windows (PowerShell), usar en su lugar:

```
javac -d out (Get-ChildItem -Recurse -Filter *.java src/main/java | ForEach-Object { $_.FullName })
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

Se abre una ventana con un formulario para registrar Guias Turisticos, Vehiculos o Colaboradores Externos, y un listado debajo que muestra el resumen de todas las entidades registradas (incluyendo seis de ejemplo cargadas al iniciar). Cada resumen varia segun el tipo real del objeto gracias al polimorfismo, se aplica mediante `instanceof` dentro de `GestorEntidades`. El mismo resumen tambien se imprime por consola.