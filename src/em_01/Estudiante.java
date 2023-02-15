package em_01;

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona {
	
	 private int semestre;
	 private Carrera carrera;
	 private Fecha fechaIngreso;
	 private List<Curso> cursos;
	

	public Estudiante(String cedula, String nombre, Fecha fechaNacimiento, String ciudadNacimiento,
			String departamentoNacimiento, String paisNacimiento, int semestre, Carrera carrera, Fecha fechaIngreso,
			List<Curso> cursos) {
		super(cedula, nombre, fechaNacimiento, ciudadNacimiento, departamentoNacimiento, paisNacimiento);
		this.semestre = semestre;
		this.carrera = carrera;
		this.fechaIngreso = fechaIngreso;
		this.cursos = new ArrayList<>();
	}


	public int getSemestre() {
		return semestre;
	}


	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}


	public Carrera getCarrera() {
		return carrera;
	}


	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}


	public Fecha getFechaIngreso() {
		return fechaIngreso;
	}


	public void setFechaIngreso(Fecha fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
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
