package em_01;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	private int codigo;
    private String nombre;
    private int numCreditos;
    private Carrera carrera;
    private String numSalon;
    private Profesor profesor;
    private List<Estudiante> estudiantes;
	

	public Curso(int codigo, String nombre, int numCreditos, Carrera carrera, String numSalon, Profesor profesor,
			List<Estudiante> estudiantes) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.numCreditos = numCreditos;
		this.carrera = carrera;
		this.numSalon = numSalon;
		this.profesor = profesor;
		this.estudiantes = new ArrayList<>();
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getNumCreditos() {
		return numCreditos;
	}


	public void setNumCreditos(int numCreditos) {
		this.numCreditos = numCreditos;
	}


	public Carrera getCarrera() {
		return carrera;
	}


	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}


	public String getNumSalon() {
		return numSalon;
	}


	public void setNumSalon(String numSalon) {
		this.numSalon = numSalon;
	}


	public Profesor getProfesor() {
		return profesor;
	}


	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}


	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}


	public void setEstudiantes(List<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
