## **Prueba Tecnica Devco Booking**

## Introducción 🚀

Fundada en 1996 en Ámsterdam, Booking.com ha pasado de ser una pequeña empresa holandesa a convertirse en una de las principales compañías digitales de viajes del mundo. Parte de Booking Holdings Inc.
(NASDAQ: BKNG), la misión de Booking.com es facilitar a todos la experiencia de viajar por el mundo.

Las pruebas de esta aplicación se realizan en el siguiente sitio web: Booking.com (https://www.booking.com/).

## Pre requisitos 📋

-Versión de Java 1.8 o mayor y 
-Java versión 1.8, actualización 191 o superior y JDK (variables de entorno configuradas).
-Eclipse IDE o IntelliJ IDEA (versión 2019 o mayor).
-Versión de Gradle 5.5.1 o mayor (variables de entorno configuradas).
-Cucumber para Java Plugin (Versión actualizada).
-Gherkin Plugin (Versión actualizada).
-Versión de ChromeDriver 99.0.4844.35 para correr local las automatizaciones.

## Web browser 🌐

Actualmente la versión en la que se ejecuta el proyecto se encuentra:
Versión 98.0.4758.102 (Build oficial) (64 bits)

## Instalación ⚙️

-Para clonar el repositorio localmente, debe correr el siguiente comando : git clone 
```https://github.com/sara236824/PruebaDevco.git```
-Importar el proyecto en Eclipse o Intellij bajo la estructura existente para un proyecto de Gradle.
-Configurar JRE System Library con JavaSE-1.8.
-Configurar la codificación a UTF-8 al proyecto una vez importado.

## Compilar el proyecto y generar el Wrapper 🔧
-Para compilar el proyecto debe correr el comando: 
```gradle clean build -x test```.

## Comando para la ejecución ▶️
- El proyecto puede correrse desde la consola, en la ruta del proyecto abrir un cmd y correr el comando:
```gradle clean test --tests=* aggregate --info```.
- El reporte de serenity se genera en esta ruta: ``/target/site/serenity/`` situado en la carpeta raíz del proyecto.

## Building 🛠

La automatización fue construida con:
-BDD (Behavior-Driven Development)
-Patron Screemplay - Aplicando los principios solid
-Gradle - Proyectos y dependencias 
-Selenium Web Driver - Herramienta para automatizar acciones en los navegadores web
-Cucumber - Framework para realizar las automatizaciones en el patron BDD
-Serenity BDD - Framework, Open source library para generacion de reportes
-Gherkin

## Programming convention 🎨

The following writing styles are used in automations:

Los siguientes estilos de escritura se utilizan en las automatizaciones:
-Para las variables y funciones: Lower Camel Case. Ejemplo: `nombramientoDeEjemplo`.
- Nombramiento de las clases: PascalCase or Upper Camel Case. Ejemplo: `nameExample`.
- Nombramiento de features: Ejemplo: `ejemplo_de_nombramiento`.

## Versionamiento 🔀

Git es usado para el control de versiones

## "Documentos de Pruebas" carpeta 📑
---
Es la carpeta que contiene un archivo de pruebas, sobre ejecuciones manuales.

Esta carpeta contiene 3 archivos 
  EjecuciondePruebas.pdf -- Es un pantallazo de un paso a paso de una prueba manual
  EvidenciaReporte.pdf -- Es un pdf que contiene el reporte de serenity de la ejecucion de las pruebas manuales
  Evidencias.html -- Contiene el mismo reporte de serenity de la ejecucion de las pruebas manuales en formato diferente.

## Booking carpeta 🎬
--- 
Es la carpeta que contiene el proyecto de pruebas automatizadas

## Estructura del proyecto de Booking🚧

EL proyecto sigue la siguiente estructura:

src/main/java/co/com/devco/booking/certificacion

+ exceptions
    Clases que capturan excepciones y lanzan mensajes personalizados cuando la automatización falla debido a que no se encuentra lo que se esperaba.

+ integrations
    Clases que permiten la conexión con los servicios.

+ interactions
    Clases que realizan acciones de bajo nivel, como seleccionar un campo de texto, buscar un caso, entre otras.

+ models
    Clases con las que se construyen los modelos de datos utilizando el patrón constructor.

+ questions
    Clases con las que se obtienen los valores de la aplicación a verificar (asserts).

+ tasks
    Clases que realizan acciones de alto nivel, como iniciar sesión en la aplicación, introducir datos en un formulario, etc.

+ userinterfaces
    Clases en las que los elementos de la interfaz de usuario se mapean lanzando Xpaths.

+ utils
    Clases que contienen funcionalidades comunes, como el manejo de archivos (Excel o XML), o el manejo de cadenas.
```

* ```src/test/java/co/com/devco/booking/certificacion/```
```
+ runners
    Clases para ejecutar las automatizaciones con los escenarios indicados en los features.

+ stepdefinitions
    Clases que permiten la traducción del lenguaje Gherkin utilizado en las Funciones al lenguaje de máquina, por lo que hacen posible la ejecución de la automatización.
    Existe una clase general de Definiciones de Pasos que contiene la configuración y los pasos que se repiten en las demás Definiciones de Pasos, por lo que la General hereda a las demás.

 ```

* ```src/test/resources/```
```

+ data_driven
   Archivos para interactuar con la aplicación a través de la automatización.

+ driver
    Chrome drivers usado para correr la automatizacion.

+ features
    Los features del proyecto se encuentran aquí.
```

## Estructura del projecto BookingManual  🚧

La estructura completa del proyecto de manual es la siguiente:

* ```src/test/java/co/com/devco/booking/certificacion```
```
+ runners
    Clases para ejecutar las pruebas manuales con los escenarios indicados en los features.

+ stepdefinitions
    Clase que permite la traducción del lenguaje Gherkin utilizado en las Características al lenguaje de máquina.
    Existe una clase general de Definiciones de Paso llamada ManualTestDefinitions que contiene la configuración para obtener las pruebas de los escenarios manuales.

* ```src/test/resources/```

+ features
    Los Features del proyecto esta aquí.

## Correr Pruebas manuales ⏭

- Al ejecutar las pruebas manuales, aparecerán varias ventanas emergentes, una por cada paso de la prueba, donde se debe indicar si el paso fue exitoso o falló.
En caso de fallo, aparecerá una nueva ventana emergente, indicando la razón por la que ha fallado.


## Vocabulario 📚
---
### BDD
BDD se utiliza como un marco de automatización para la automatización de escenarios de prueba, la idea es escribir las pruebas antes de escribir el código fuente, pero en lugar de pruebas unitarias, lo que se hace es escribir pruebas que verifiquen que el comportamiento de la Aplicación es correcto desde el punto de vista del negocio. Después de escribir las pruebas, se escribe el código fuente de la funcionalidad que hace que estas pruebas pasen.


### Gherkin
Gherkin se utiliza como lenguaje para el desarrollo de funcionalidades ya que es un lenguaje comprensible por humanos y ordenadores, con él se define el comportamiento de la página a automatizar. Es un lenguaje fácil de leer, fácil de entender y fácil de escribir. El uso de Gherkin permite crear una documentación viva mientras se automatizan las pruebas, haciéndolo además con un lenguaje que puede ser entendido desde el punto de vista del negocio.

Para construir BDD con Gherkin sólo es necesario conocer 5 palabras. Con las que se hacen las sentencias que describen las funcionalidades:

- **Feature:** Indica el nombre de la funcionalidad a probar. Debe ser un título claro y explícito. Además, se incluye una descripción en forma de historia de usuario: "Como [rol] quiero [funcionalidad] para que [beneficios]". De acuerdo con esta descripción, se construyen los escenarios de prueba.
- **Scenario:** Describe cada escenario a probar.
- **Given:** Proporciona el contexto del escenario en el que se ejecutará la prueba, como el punto en el que se realiza la prueba, o los requisitos previos de los datos. Incluye los pasos necesarios para poner el sistema en el estado deseado para ejecutar la prueba.
- **When:** Especifica el conjunto de acciones que lanzan la prueba. La interacción del usuario que desencadena la funcionalidad a probar.
- **Then:** Especifica el resultado esperado en la prueba. Se valida si los cambios observados en el sistema son los deseados.

Además de estas cinco palabras, se puede utilizar **Background** para agrupar los mismos pasos que se ejecutan antes de cada escenario con el fin de evitar la repetición de código.

### Cucumber

Cucumber se utiliza como una herramienta para automatizar las pruebas en BDD. Cucumber permite ejecutar descripciones funcionales en texto plano como pruebas de software automatizadas. Es totalmente compatible con el lenguaje Gherkin.

 ### Compiler

El proyecto se crea con Gradle, que es un gestor de proyectos y dependencias, es la versión mejorada de Maven, pero intenta ir un paso más allá. Para empezar, se apoya en Groovy y en un DSL (Domain Specific Language) para trabajar con un lenguaje sencillo y claro a la hora de construir el build en comparación con Maven. Por otro lado, tiene una gran flexibilidad que permite trabajar con otros lenguajes y no sólo con Java.

### IntelliJ

El IDE IntelliJ se utiliza para el desarrollo de la automatización. IntelliJ es una plataforma de desarrollo, diseñada para ser ampliada indefinidamente mediante plug-ins. Fue concebido desde sus orígenes para convertirse en una plataforma de integración de herramientas de desarrollo.

No tiene un lenguaje específico en mente, sino que es un IDE genérico, aunque es muy popular entre la comunidad de desarrolladores del lenguaje Java que utilizan el plug-in JDT que se incluye en la distribución estándar del IDE.

Proporciona herramientas para gestionar espacios de trabajo, escribir, desplegar, ejecutar y depurar aplicaciones.

## Author ✒

* **Sara Victoria Padilla Rodriguez** - [Saritapadilla23@gmail.com](#github #sara236824)  