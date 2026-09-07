# Actividad 2: Patrones Estructurales - Adapter y Facade

Este proyecto implementa el sistema de gestión de tutorías de la UEES aplicando los patrones de diseño **Adapter** y **Facade** en Java 21 utilizando Apache Maven.

---

## 📁 Estructura del Proyecto

Act2-adapter-facade/
├── pom.xml
└── src/
    └── main/
        └── java/
            └── edu/
                └── uees/
                    └── disenosoftware/
                        ├── adapter/
                        │   ├── Videoconferencia.java      (Target Interface)
                        │   ├── ProveedorZoom.java         (Adaptee - Zoom)
                        │   ├── ZoomAdapter.java           (Adapter - Zoom)
                        │   ├── MicrosoftTeamsAPI.java     (Adaptee - Teams)
                        │   └── TeamsAdapter.java          (Adapter - Teams)
                        ├── app/
                        │   └── Main.java                  (Clase Principal)
                        ├── domain/
                        │   ├── Docente.java               (Modelo)
                        │   ├── Estudiante.java            (Modelo)
                        │   └── Reserva.java               (Modelo)
                        └── facade/
                            ├── Notificador.java           (Interface Notificaciones)
                            ├── NotificadorConsola.java    (Implementación Notificación)
                            ├── ServicioCalendario.java    (Subsistema Calendario)
                            ├── ServicioReservas.java      (Subsistema Reservas)
                            └── TutoriasFacade.java        (Facade Principal)

🛠️ Patrones de Diseño Implementados
1. Patrón Adapter
Permite unificar diferentes APIS de videollamadas que poseen firmas de métodos incompatibles bajo una interfaz común (Videoconferencia).

Target: Videoconferencia

Adaptees: ProveedorZoom, MicrosoftTeamsAPI

Adapters: ZoomAdapter, TeamsAdapter

2. Patrón Facade
Simplifica la complejidad del subsistema de tutorías unificando en un solo método (crearTutoriaVirtual) las operaciones de:

Registro de reservas (ServicioReservas)

Generación de enlaces virtuales (Videoconferencia)

Programación en agenda (ServicioCalendario)

Envío de avisos (Notificador)

🚀 Requisitos y Ejecución
Java JDK: 21

Build Tool: Apache Maven
