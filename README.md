# Trabajo Práctico N° 3 - Programación Orientada a Objetos

Trabajo práctico de la materia **Programación Orientada a Objetos**, resuelto en **Java**.

El foco del TP es el **conocimiento entre objetos** (colaboradores): declarar clases que se relacionan entre sí, instanciar objetos complejos (que contienen a otros objetos) y aprovechar el **encapsulamiento**, de modo que si cambia la estructura interna de una clase, su interfaz no varíe.

## Objetivos

- Interpretar diagramas de clases en UML.
- Declarar clases con colaboradores.
- Comprender el concepto de "conocimiento" entre objetos.
- Instanciar objetos complejos.
- Entender la utilidad del encapsulamiento de estructura y métodos.

## Ejercicios

| N° | Tema | Clases | Clase ejecutable |
|----|------|--------|------------------|
| 1 | Droguería: productos y stock | `Producto`, `Laboratorio` | `GestionStock` |
| 2 | Distancia entre puntos | `Punto` | - |
| 3 | Círculos | `Circulo`, `Punto` | `CreaFigura` |
| 4 | Rectángulos | `Rectangulo`, `Punto` | `CreaFigura` |
| 5 | Cuenta bancaria | `CuentaBancaria`, `Persona` | - |
| 6 | Recibo de sueldo de un docente | `Escuela`, `Docente` | `Secretaria` |
| 7 | Caja de ahorro y cuenta corriente | `CajaDeAhorro`, `CuentaCorriente`, `Persona` | `Banco` |
| 8 | Datos filiatorios de pacientes | `Hospital`, `Paciente`, `Localidad` | `GestionHospital` |
| 9 | Fecha de nacimiento con `Calendar` y cumpleaños | `Persona`, `Banco` | `Banco` |
| 10 | Certificados de matrimonio y divorcio | `Hombre`, `Mujer` | `RegistroCivil` |
| 11 | Fecha de ingreso con `Calendar` y aniversario laboral | `Empleado` | `Empresa` |
| 12 | Empleados con jefe | `EmpleadoConJefe` | - |

## Consignas generales

- Implementar el código Java de cada diagrama de clases, incluyendo constructores y accessors.
- Documentar con **Javadoc**.
- Crear una clase ejecutable por ejercicio para probar las clases y sus métodos.
- Ingreso de datos:
  - Ejercicio 1: constantes en el ejecutable.
  - Ejercicio 2: argumentos del `main()`.
  - Ejercicios restantes: por teclado con `Scanner`.
- Al menos un ejercicio con menú de opciones.

## Estructura del repositorio

```
TrabajoPractico3---POO/
├── trabajoPractico3/   # código fuente del TP
└── A CORREJIR          # notas sobre cosas pendientes de corregir
```

<!-- Ajustá esta sección si dentro de trabajoPractico3 organizaste los ejercicios en paquetes o carpetas. -->

## Requisitos

- JDK 8 o superior.

## Compilar y ejecutar

```bash
git clone https://github.com/qqaston/TrabajoPractico3---POO.git
cd TrabajoPractico3---POO/trabajoPractico3

# compilar
javac *.java

# ejecutar una clase con main, por ejemplo:
java GestionStock
```

<!-- Si usás paquetes, el comando cambia: javac -d out $(find . -name "*.java") y java -cp out paquete.Clase
     Si usás NetBeans/Eclipse/IntelliJ, podés aclarar que se abre como proyecto. -->

## Estado

Hay cosas pendientes de revisar, anotadas en el archivo `A CORREJIR`.

## Autor

[@qqaston](https://github.com/qqaston)
