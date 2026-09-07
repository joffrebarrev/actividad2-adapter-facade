package edu.uees.disenosoftware.app;

import edu.uees.disenosoftware.adapter.*;
import edu.uees.disenosoftware.domain.*;
import edu.uees.disenosoftware.facade.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PASO 1: Probar el Adapter de forma aislada ===");
        ProveedorZoom zoom = new ProveedorZoom();
        Videoconferencia video = new ZoomAdapter(zoom);
        String enlace = video.crearSala("Tutoría Diseño de Software", "docente@uees.edu.ec");
        System.out.println("Enlace: " + enlace);

        System.out.println("\n=== PASO 2: Probar la Facade completa (Zoom) ===");
        Estudiante estudiante = new Estudiante("Ana Pérez", "ana@uees.edu.ec");
        Docente docente = new Docente("Carlos Ruiz", "carlos@uees.edu.ec");
        Reserva reserva = new Reserva("R-001", estudiante, docente, "Patrones estructurales");

        TutoriasFacade facadeZoom = new TutoriasFacade(
                new ServicioReservas(),
                new ZoomAdapter(new ProveedorZoom()),
                new ServicioCalendario(),
                new NotificadorConsola()
        );
        Reserva creadaZoom = facadeZoom.crearTutoriaVirtual(reserva);
        System.out.println("Tutoría Zoom creada con id: " + creadaZoom.getId());

        System.out.println("\n=== PASO 3: Probar la Facade con TeamsAdapter ===");
        TutoriasFacade facadeTeams = new TutoriasFacade(
                new ServicioReservas(),
                new TeamsAdapter(new MicrosoftTeamsAPI()),
                new ServicioCalendario(),
                new NotificadorConsola()
        );
        Reserva creadaTeams = facadeTeams.crearTutoriaVirtual(reserva);
        System.out.println("Tutoría Teams creada con id: " + creadaTeams.getId());
    }
}