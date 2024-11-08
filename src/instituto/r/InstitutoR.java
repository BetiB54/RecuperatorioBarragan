package instituto.r;

import java.util.ArrayList;
import java.util.List;

public class InstitutoR {

    public static void main(String[] args) {

        //lista de alumnos//
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("juan", 0001));
        alumnos.add(new Alumno("pepe", 0002));
        alumnos.add(new Alumno("luis", 0003));
        alumnos.add(new Alumno("carlos", 0004));
        alumnos.add(new Alumno("lilo", 0005));

        //lista del curso//
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("base de datos", "cristian"));
        cursos.add(new Curso("Ingenieria", "marcos"));
        cursos.add(new Curso("practicas", "sergio"));
        cursos.add(new Curso("ingles", "angie"));
        cursos.add(new Curso("matematicas", "lujan"));

        //lista de inscripciones//
        List<Inscripcion> inscripciones = new ArrayList<>();
        inscripciones.add(new Inscripcion(alumnos.get(0), cursos.get(0), 10, true, 00));
        inscripciones.add(new Inscripcion(alumnos.get(1), cursos.get(1), 4, true, 01));
        inscripciones.add(new Inscripcion(alumnos.get(2), cursos.get(2), 1, true, 02));
        inscripciones.add(new Inscripcion(alumnos.get(3), cursos.get(3), 2, true, 03));
        inscripciones.add(new Inscripcion(alumnos.get(4), cursos.get(4), 6, true, 04));

        //busqueda de alumno//
        int alumnoBuscado = 1;
        boolean encontrado = false;
        int i = 0;
        while (i < alumnos.size() && !encontrado) {
            Alumno alumnoActual = alumnos.get(i);
            if (alumnoActual.getMatricula() == alumnoBuscado) {
                System.out.println("el alumno es: " + alumnoActual.getNombre());
                encontrado = true;
            }
            i++;

        }
        if (!encontrado) {
            System.out.println("ese alumno no esta");
        }

        //buscar por inscripcion//
        int IDBuscado = 0;
        boolean encontradoInscripcion = false;
        i = 0;
        while (i < inscripciones.size() && !encontradoInscripcion) {
            Inscripcion inscripcionActual = inscripciones.get(i);
            if (inscripcionActual.getID() == IDBuscado) {
                System.out.println("La inscripción es del alumno: " + inscripcionActual.getAlumno().getNombre());
                System.out.println("Curso: " + inscripcionActual.getCurso().getNombre());
                System.out.println("docente: " + inscripcionActual.getCurso().getDocente());
                System.out.println("Nota: " + inscripcionActual.getNota());
                System.out.println("situacion: " + inscripcionActual.situacionAlumno(encontrado));

                encontradoInscripcion = true;
            }
            i++;

        }

        if (!encontradoInscripcion) {
            System.out.println("Esa inscripción no está registrada.");
        }
    }

    //mostrar cantidad de aporbados y desaprobados//
    
  List<Inscripcion>inscripciones;{
    int cantidadAprobados = 0;
    int cantidadDesaprobados = 0;
   
    for (Inscripcion inscripcion: inscripciones){
      if (inscripcion.isSituacion()){
          cantidadAprobados++;
          System.out.println("cantidad de aprobados: " + cantidadAprobados);
      }
      else{
          cantidadDesaprobados++;
          System.out.println("cantidad de desaprobados: " + cantidadDesaprobados);
      }

       
    
    
    }
    
    }
}


