package sct.contornos.gestion;

import sct.contornos.persona.Alumno;
import sct.contornos.persona.Profesor;
import java.util.Date;
/**
 * Clase Gestion
 * @author Adriam paz
 */
public class Gestion {
    public static void main(String[] args) {
        // Crear un Centro
        Centro centro = new Centro(1, "IES San Clemente", "Santiago", "Rúa de San Clemente", "1", 15705);
        System.out.println("Centro: " + centro);
        System.out.println("Dirección: " + centro.getDireccion());
        
        // Crear un Nivel
        Nivel nivel = new Nivel("Grado Superior");
        System.out.println("Nivel: " + nivel);
        
        // Crear un Ciclo
        Ciclo ciclo = new Ciclo("DAM", "Desarrollo de Aplicaciones Multiplataforma", nivel, centro);
        System.out.println("Ciclo: " + ciclo);
        
        // Crear un Módulo
        Modulo modulo = new Modulo("CD", "Contornos de Desarrollo", "Módulo de desarrollo", 150, 100, ciclo);
        System.out.println("Módulo: " + modulo);
        System.out.println("Sesiones PD: " + modulo.sesionesPD());
        System.out.println("Sesiones AP: " + modulo.sesionesAP());
        
        // Crear un Alumno
        Alumno alumno = new Alumno("12345678A", "Juan", "García", "López", "juan@email.com", 600123456, new Date(), "XA001", true);
        System.out.println("Alumno: " + alumno);
        
        // Crear un Profesor
        Profesor profesor = new Profesor("87654321B", "María", "Fernández", "Pérez", "maria@email.com", 600654321, new Date(), "Informática", "Profesor Técnico", false, new Date());
        System.out.println("Profesor: " + profesor);
        
        // Crear una Matrícula
        Matricula matricula = new Matricula(alumno, modulo, 8, "2025/2026");
        System.out.println("Matrícula: " + matricula);
    }
}