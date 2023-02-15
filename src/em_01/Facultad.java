package em_01;

import java.util.ArrayList;
import java.util.List;

public class Facultad {

	private String nombre;
    private List<Profesor> profesores;
    private List<Estudiante> estudiantes;
    private List<Carrera> carreras;
    private List<Curso> cursos;
    
    
	public Facultad(String nombre, List<Profesor> profesores, List<Estudiante> estudiantes, List<Carrera> carreras,
			List<Curso> cursos) {
		this.nombre = nombre;
		this.profesores = new ArrayList<>();
		this.estudiantes = new ArrayList<>();
		this.carreras = new ArrayList<>();
		this.cursos = new ArrayList<>();
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public List<Profesor> getProfesores() {
		return profesores;
	}


	public void setProfesores(List<Profesor> profesores) {
		this.profesores = profesores;
	}


	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}


	public void setEstudiantes(List<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}


	public List<Carrera> getCarreras() {
		return carreras;
	}


	public void setCarreras(List<Carrera> carreras) {
		this.carreras = carreras;
	}


	public List<Curso> getCursos() {
		return cursos;
	}


	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
