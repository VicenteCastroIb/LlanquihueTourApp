# LlanquihueTourApp

## Objetivo - Semana 6

Implementar una jerarquía de clases con herencia simple para representar los servicios turísticos de la agencia **Llanquihue Tour**. Se aplican conceptos de atributos heredados, uso de `super()`, sobreescritura de `toString()` y organización por paquetes.

---

## Estructura del proyecto

```
src/
└── com/puertogames/
    ├── model/
    │   ├── ServicioTuristico.java     # Superclase base
    │   ├── ExcursionCultural.java     # Subclase con atributo lugarHistorico
    │   ├── PaseoLacustre.java         # Subclase con atributo tipoEmbarcacion
    │   └── RutaGastronomica.java      # Subclase con atributo numeroDeParadas
    ├── data/
    │   └── GestorServicios.java       # Crea instancias de prueba
    └── ui/
        └── Main.java                  # Punto de entrada del programa
```

---

## Clases creadas

| Clase | Paquete | Descripción |
|---|---|---|
| `ServicioTuristico` | `model` | Superclase con atributos `nombre` y `duracionHoras` |
| `ExcursionCultural` | `model` | Hereda de ServicioTuristico, agrega `lugarHistorico` |
| `PaseoLacustre` | `model` | Hereda de ServicioTuristico, agrega `tipoEmbarcacion` |
| `RutaGastronomica` | `model` | Hereda de ServicioTuristico, agrega `numeroDeParadas` |
| `GestorServicios` | `data` | Crea 2 instancias de cada subclase |
| `Main` | `ui` | Ejecuta el programa y muestra los resultados |

---

## Instrucciones para ejecutar

1. Clona el repositorio:
   ```bash
   git clone https://github.com/VicenteCastroIb/LlanquihueTourApp.git
   ```

2. Abre el proyecto en IntelliJ IDEA (o tu IDE de preferencia).

3. Ejecuta la clase `Main` ubicada en `src/com/puertogames/ui/Main.java`.

4. La salida en consola mostrará los 6 servicios turísticos creados con toda su información.

---

## Ejemplo de salida esperada

```
=== Servicios Turísticos - Llanquihue Tour ===

ExcursionCultural --> Nombre: Excursion al norte | Duracion-Horas: 5 | Lugar Historico: Desierto Atacama
----------------------------------------------
PaseoLacustre --> Nombre: Lacustre Al Sur | Duracion-Horas: 3 | Tipo Embarcacion: Transfer A-233
----------------------------------------------
RutaGastronomica --> Nombre: Pastas Italianas | Duracion-Horas: 6 | Numero de Paradas: 6
----------------------------------------------
...
```
