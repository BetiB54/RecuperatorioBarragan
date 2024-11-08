package instituto.r;

public class Inscripcion {

    private Alumno alumno;
    private Curso curso;
    private int nota;
    private boolean situacion;
    private int ID;

    public Inscripcion(Alumno alumno, Curso curso, int nota, boolean situacion, int ID) {
        this.alumno = alumno;
        this.curso = curso;
        this.nota = nota;
        this.situacion = situacion;
        this.ID = ID;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public boolean isSituacion() {
        return situacion;
    }

    public void setSituacion(boolean situacion) {
        this.situacion = situacion;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

      
    public int situacionAlumno(boolean aprobado) {
        if (nota > 6) {
            System.out.println("aprobado");
            aprobado = true;

        } else {

            if (nota < 6) {
                System.out.println("desaprobado");
                aprobado = false;
            }
        }
        return nota;
    }
}
