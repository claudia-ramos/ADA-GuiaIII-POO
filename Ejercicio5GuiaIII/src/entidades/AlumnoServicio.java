package entidades;

import java.util.ArrayList;

public class AlumnoServicio {

    private ArrayList<Alumno> alumnos;

    public AlumnoServicio() {
        alumnos = new ArrayList<>();
    }

    public AlumnoServicio(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void crearAlumnos(String nombre, Integer nota1, Integer nota2, Integer nota3) {
        ArrayList<Integer> notas = new ArrayList<>();
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);

        Alumno alumno = new Alumno();
        alumno.setNombre(nombre);
        alumno.setNotas(notas);
        añadirAlumno(alumno);
    }

    public void añadirAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
    }


    public void verListado() {
        for(Alumno alumno : alumnos) {
            System.out.println(alumno.toString());
        }
    }
}
