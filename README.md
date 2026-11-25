![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)

# 🧠 Semana 6 - Creando jerarquías de clases con herencia simple

## Desarrollo Orientado a Objetos I

## Sistema de Gestión de Servicios Turísticos - Llanquihue Tour

## 👤 Autor del proyecto

- **Nombre completo:** Jemima Palma Lillo
- **Carrera:** Analista Programador Computacional
- **Sede:** Online

---

## 📘 Descripción general del sistema

Este proyecto corresponde a la actividad de la Semana 6 de la asignatura *Desarrollo Orientado a Objetos I*.

Consiste en el desarrollo de un sistema básico para la agencia de turismo "Llanquihue Tour", utilizando el lenguaje Java y los principios de la programación orientada a objetos.

El objetivo principal es implementar una jerarquía de clases mediante el concepto de **herencia simple**, creando una superclase llamada `ServicioTuristico` y tres subclases: `RutaGastronomica`, `PaseoLacustre` y `ExcursionCultural`.

Cada subclase hereda los atributos comunes de la superclase e incorpora información específica según el tipo de servicio turístico que representa.

Además, se utiliza el método `super()` para invocar el constructor de la clase padre y se sobrescribe el método `toString()` para mostrar la información completa de cada objeto.

---

## 🧱 Estructura general del proyecto

```plaintext
📁 Semana 6/
│
└── src/
    │
    ├── data/
    │   └── GestorServicios.java
    │
    ├── model/
    │   ├── ServicioTuristico.java
    │   ├── RutaGastronomica.java
    │   ├── PaseoLacustre.java
    │   └── ExcursionCultural.java
    │
    └── ui/
        └── Main.java
```

### Clases implementadas

El proyecto contiene seis clases principales:

**1. ServicioTuristico**

Es la superclase que representa los servicios turísticos. Contiene los atributos comunes `nombre` y `duracionHoras`, que son heredados por las subclases. También implementa el método `toString()` para mostrar la información general del servicio.

**2. RutaGastronomica**

Es una subclase de `ServicioTuristico` que representa las rutas gastronómicas. Hereda los atributos de la clase padre e incorpora el atributo `numeroDeParadas`, que indica la cantidad de paradas de cada ruta.

**3. PaseoLacustre**

Es una subclase de `ServicioTuristico` que representa los paseos lacustres. Hereda los atributos comunes e incorpora `tipoEmbarcacion`, que permite identificar el tipo de embarcación utilizada.

**4. ExcursionCultural**

Es una subclase de `ServicioTuristico` que representa las excursiones culturales. Hereda los atributos de la clase padre e incorpora `lugarHistorico`, que identifica el lugar histórico asociado a la excursión.

**5. GestorServicios**

Es la clase encargada de crear los objetos de prueba de cada subclase y mostrar sus datos por consola. Se implementan dos instancias de cada tipo de servicio turístico, obteniendo un total de seis objetos.

**6. Main**

Es la clase principal encargada de ejecutar el programa. Crea un objeto de tipo `GestorServicios` y llama al método `mostrarServiciosPrueba()` para visualizar los servicios turísticos registrados.

---

## 🔗 Relaciones entre clases

El proyecto implementa una relación de **herencia** entre la superclase `ServicioTuristico` y sus tres subclases.

Las clases `RutaGastronomica`, `PaseoLacustre` y `ExcursionCultural` utilizan la palabra reservada `extends` para heredar los atributos y comportamientos de la clase padre.

Además, cada subclase utiliza `super()` dentro de su constructor para inicializar los atributos heredados de `ServicioTuristico`.

La sobrescritura del método `toString()` mediante `@Override` permite que cada subclase muestre tanto la información general heredada como sus propios atributos específicos.

---

## ⚙️ Funcionalidades implementadas

- Creación de una superclase llamada `ServicioTuristico`.
- Implementación de tres subclases mediante el mecanismo de herencia.
- Uso de `extends` para establecer la relación de herencia.
- Uso de `super()` para llamar al constructor de la clase padre.
- Implementación de constructores en las clases.
- Encapsulamiento de atributos mediante la variable `private`.
- Implementación de métodos getters y setters.
- Sobrescritura del método `toString()` mediante `@Override`.
- Creación de dos objetos de prueba por cada subclase.
- Visualización de seis servicios turísticos por consola.

---

## 🖥️ Ejecución del programa

Al ejecutar la clase `Main`, el sistema muestra en consola el catálogo de servicios turísticos de Llanquihue Tour.

Los resultados se presentan organizados en tres categorías:

- Rutas gastronómicas.
- Paseos lacustres.
- Excursiones culturales.

Cada categoría muestra dos objetos con sus respectivos atributos heredados y específicos.

---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clonar el repositorio desde GitHub.
2. Abrir el proyecto en IntelliJ IDEA.
3. Verificar que la carpeta `src` contenga los paquetes `data`, `model` y `ui`.
4. Ubicar el archivo `Main.java` dentro del paquete `ui`.
5. Ejecutar el método `main`.
6. Visualizar en la consola el catálogo de servicios turísticos y la información de los seis objetos creados.

---

**Repositorio GitHub:** https://github.com/jempalma-ops/LlanquihueTourApp

**Fecha de entrega:** [30/11/2026]

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Semana 6 - Desarrollo Orientado a Objetos I
