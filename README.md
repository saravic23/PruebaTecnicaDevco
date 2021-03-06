## **Prueba Tecnica Devco Booking**

## Introducci贸n 馃殌

Fundada en 1996 en 脕msterdam, Booking.com ha pasado de ser una peque帽a empresa holandesa a convertirse en una de las principales compa帽铆as digitales de viajes del mundo. Parte de Booking Holdings Inc.
(NASDAQ: BKNG), la misi贸n de Booking.com es facilitar a todos la experiencia de viajar por el mundo.

Las pruebas de esta aplicaci贸n se realizan en el siguiente sitio web: Booking.com (https://www.booking.com/).

## Pre requisitos 馃搵

-Versi贸n de Java 1.8 o mayor y 
-Java versi贸n 1.8, actualizaci贸n 191 o superior y JDK (variables de entorno configuradas).
-Eclipse IDE o IntelliJ IDEA (versi贸n 2019 o mayor).
-Versi贸n de Gradle 5.5.1 o mayor (variables de entorno configuradas).
-Cucumber para Java Plugin (Versi贸n actualizada).
-Gherkin Plugin (Versi贸n actualizada).
-Versi贸n de ChromeDriver 99.0.4844.35 para correr local las automatizaciones.

## Web browser 馃寪

Actualmente la versi贸n en la que se ejecuta el proyecto se encuentra:
Versi贸n 98.0.4758.102 (Build oficial) (64 bits)

## Instalaci贸n 鈿欙笍

-Para clonar el repositorio localmente, debe correr el siguiente comando : git clone 
```https://github.com/sara236824/PruebaDevco.git```
-Importar el proyecto en Eclipse o Intellij bajo la estructura existente para un proyecto de Gradle.
-Configurar JRE System Library con JavaSE-1.8.
-Configurar la codificaci贸n a UTF-8 al proyecto una vez importado.

## Compilar el proyecto y generar el Wrapper 馃敡
-Para compilar el proyecto debe correr el comando: 
```gradle clean build -x test```.

## Comando para la ejecuci贸n 鈻讹笍
- El proyecto puede correrse desde la consola, en la ruta del proyecto abrir un cmd y correr el comando:
```gradle clean test --tests=* aggregate --info```.
- El reporte de serenity se genera en esta ruta: ``/target/site/serenity/`` situado en la carpeta ra铆z del proyecto.

## Building 馃洜

La automatizaci贸n fue construida con:
-BDD (Behavior-Driven Development)
-Patron Screemplay - Aplicando los principios solid
-Gradle - Proyectos y dependencias 
-Selenium Web Driver - Herramienta para automatizar acciones en los navegadores web
-Cucumber - Framework para realizar las automatizaciones en el patron BDD
-Serenity BDD - Framework, Open source library para generacion de reportes
-Gherkin

## Programming convention 馃帹

The following writing styles are used in automations:

Los siguientes estilos de escritura se utilizan en las automatizaciones:
-Para las variables y funciones: Lower Camel Case. Ejemplo: `nombramientoDeEjemplo`.
- Nombramiento de las clases: PascalCase or Upper Camel Case. Ejemplo: `nameExample`.
- Nombramiento de features: Ejemplo: `ejemplo_de_nombramiento`.

## Versionamiento 馃攢

Git es usado para el control de versiones

## "Documentos de Pruebas" carpeta 馃搼
---
Es la carpeta que contiene un archivo de pruebas, sobre ejecuciones manuales.

Esta carpeta contiene 3 archivos 
  EjecuciondePruebas.pdf -- Es un pantallazo de un paso a paso de una prueba manual
  EvidenciaReporte.pdf -- Es un pdf que contiene el reporte de serenity de la ejecucion de las pruebas manuales
  Evidencias.html -- Contiene el mismo reporte de serenity de la ejecucion de las pruebas manuales en formato diferente.

## Booking carpeta 馃幀
--- 
Es la carpeta que contiene el proyecto de pruebas automatizadas

## Estructura del proyecto de Booking馃毀

EL proyecto sigue la siguiente estructura:

src/main/java/co/com/devco/booking/certificacion

+ exceptions
    Clases que capturan excepciones y lanzan mensajes personalizados cuando la automatizaci贸n falla debido a que no se encuentra lo que se esperaba.

+ integrations
    Clases que permiten la conexi贸n con los servicios.

+ interactions
    Clases que realizan acciones de bajo nivel, como seleccionar un campo de texto, buscar un caso, entre otras.

+ models
    Clases con las que se construyen los modelos de datos utilizando el patr贸n constructor.

+ questions
    Clases con las que se obtienen los valores de la aplicaci贸n a verificar (asserts).

+ tasks
    Clases que realizan acciones de alto nivel, como iniciar sesi贸n en la aplicaci贸n, introducir datos en un formulario, etc.

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
    Clases que permiten la traducci贸n del lenguaje Gherkin utilizado en las Funciones al lenguaje de m谩quina, por lo que hacen posible la ejecuci贸n de la automatizaci贸n.
    Existe una clase general de Definiciones de Pasos que contiene la configuraci贸n y los pasos que se repiten en las dem谩s Definiciones de Pasos, por lo que la General hereda a las dem谩s.

 ```

* ```src/test/resources/```
```

+ data_driven
   Archivos para interactuar con la aplicaci贸n a trav茅s de la automatizaci贸n.

+ driver
    Chrome drivers usado para correr la automatizacion.

+ features
    Los features del proyecto se encuentran aqu铆.
```

## Estructura del projecto BookingManual  馃毀

La estructura completa del proyecto de manual es la siguiente:

* ```src/test/java/co/com/devco/booking/certificacion```
```
+ runners
    Clases para ejecutar las pruebas manuales con los escenarios indicados en los features.

+ stepdefinitions
    Clase que permite la traducci贸n del lenguaje Gherkin utilizado en las Caracter铆sticas al lenguaje de m谩quina.
    Existe una clase general de Definiciones de Paso llamada ManualTestDefinitions que contiene la configuraci贸n para obtener las pruebas de los escenarios manuales.

* ```src/test/resources/```

+ features
    Los Features del proyecto esta aqu铆.

## Correr Pruebas manuales 鈴?

- Al ejecutar las pruebas manuales, aparecer谩n varias ventanas emergentes, una por cada paso de la prueba, donde se debe indicar si el paso fue exitoso o fall贸.
En caso de fallo, aparecer谩 una nueva ventana emergente, indicando la raz贸n por la que ha fallado.


## Vocabulario 馃摎
---
### BDD
BDD se utiliza como un marco de automatizaci贸n para la automatizaci贸n de escenarios de prueba, la idea es escribir las pruebas antes de escribir el c贸digo fuente, pero en lugar de pruebas unitarias, lo que se hace es escribir pruebas que verifiquen que el comportamiento de la Aplicaci贸n es correcto desde el punto de vista del negocio. Despu茅s de escribir las pruebas, se escribe el c贸digo fuente de la funcionalidad que hace que estas pruebas pasen.


### Gherkin
Gherkin se utiliza como lenguaje para el desarrollo de funcionalidades ya que es un lenguaje comprensible por humanos y ordenadores, con 茅l se define el comportamiento de la p谩gina a automatizar. Es un lenguaje f谩cil de leer, f谩cil de entender y f谩cil de escribir. El uso de Gherkin permite crear una documentaci贸n viva mientras se automatizan las pruebas, haci茅ndolo adem谩s con un lenguaje que puede ser entendido desde el punto de vista del negocio.

Para construir BDD con Gherkin s贸lo es necesario conocer 5 palabras. Con las que se hacen las sentencias que describen las funcionalidades:

- **Feature:** Indica el nombre de la funcionalidad a probar. Debe ser un t铆tulo claro y expl铆cito. Adem谩s, se incluye una descripci贸n en forma de historia de usuario: "Como [rol] quiero [funcionalidad] para que [beneficios]". De acuerdo con esta descripci贸n, se construyen los escenarios de prueba.
- **Scenario:** Describe cada escenario a probar.
- **Given:** Proporciona el contexto del escenario en el que se ejecutar谩 la prueba, como el punto en el que se realiza la prueba, o los requisitos previos de los datos. Incluye los pasos necesarios para poner el sistema en el estado deseado para ejecutar la prueba.
- **When:** Especifica el conjunto de acciones que lanzan la prueba. La interacci贸n del usuario que desencadena la funcionalidad a probar.
- **Then:** Especifica el resultado esperado en la prueba. Se valida si los cambios observados en el sistema son los deseados.

Adem谩s de estas cinco palabras, se puede utilizar **Background** para agrupar los mismos pasos que se ejecutan antes de cada escenario con el fin de evitar la repetici贸n de c贸digo.

### Cucumber

Cucumber se utiliza como una herramienta para automatizar las pruebas en BDD. Cucumber permite ejecutar descripciones funcionales en texto plano como pruebas de software automatizadas. Es totalmente compatible con el lenguaje Gherkin.

 ### Compiler

El proyecto se crea con Gradle, que es un gestor de proyectos y dependencias, es la versi贸n mejorada de Maven, pero intenta ir un paso m谩s all谩. Para empezar, se apoya en Groovy y en un DSL (Domain Specific Language) para trabajar con un lenguaje sencillo y claro a la hora de construir el build en comparaci贸n con Maven. Por otro lado, tiene una gran flexibilidad que permite trabajar con otros lenguajes y no s贸lo con Java.

### IntelliJ

El IDE IntelliJ se utiliza para el desarrollo de la automatizaci贸n. IntelliJ es una plataforma de desarrollo, dise帽ada para ser ampliada indefinidamente mediante plug-ins. Fue concebido desde sus or铆genes para convertirse en una plataforma de integraci贸n de herramientas de desarrollo.

No tiene un lenguaje espec铆fico en mente, sino que es un IDE gen茅rico, aunque es muy popular entre la comunidad de desarrolladores del lenguaje Java que utilizan el plug-in JDT que se incluye en la distribuci贸n est谩ndar del IDE.

Proporciona herramientas para gestionar espacios de trabajo, escribir, desplegar, ejecutar y depurar aplicaciones.

## Author 鉁?

* **Sara Victoria Padilla Rodriguez** - [Saritapadilla23@gmail.com](#github #sara236824)  
