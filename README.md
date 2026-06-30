# Sistema-de-Turnos-Medicos
Este repositorio contiene el código fuente del proyecto de simulación de atención de pacientes, desarrollado como parte de las prácticas de Programación Orientada a Objetos en la Pontificia Universidad Católica del Ecuador (PUCE).

## Descripción
El sistema es una aplicación de consola en Java que simula el proceso de llegada y atención de pacientes en un centro médico. Para garantizar que el modelo refleje el mundo real, implementa una estructura de datos de **Cola (Queue)** bajo el principio **FIFO** (First In, First Out), asegurando que el primer paciente en llegar sea el primero en ser atendido.

## Requerimientos Técnicos Cumplidos
* **Modelado de Entidades:** Implementación de la clase `Paciente` con sus respectivos atributos y encapsulamiento.
* **Sistema de Turnos:** Uso de la interfaz `Queue` (mediante `LinkedList`) para la gestión eficiente de la fila de espera.
* **Interactividad:** Menú en consola que permite registrar pacientes, atenderlos y visualizar en tiempo real la cantidad de personas esperando.

## Instrucciones de Ejecución
1. Clona este repositorio en tu máquina local.
2. Abre la carpeta del proyecto en Visual Studio Code u otro IDE compatible con Java.
3. Localiza el paquete `SRC`.
4. Compila y ejecuta el archivo principal `SistemaCentroSalud.java`.

## Autores
* **Isaac Oña** - *Desarrollo e Implementación*
* **Axel Masache** - *Desarrollo e Implementación*