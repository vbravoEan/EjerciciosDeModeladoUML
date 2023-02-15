package em_01;

import java.util.ArrayList;
import java.util.List;

public class Carrera {
	
	private String nombre;
    private int creditosTotales;
    private int numSemestres;
    private String nivel;
    private Facultad facultad;
    private List<Curso> cursos;

	public Carrera(String nombre, int creditosTotales, int numSemestres, String nivel, Facultad facultad,
			List<Curso> cursos) {
		super();
		this.nombre = nombre;
		this.creditosTotales = creditosTotales;
		this.numSemestres = numSemestres;
		this.nivel = nivel;
		this.facultad = facultad;
		this.cursos = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCreditosTotales() {
		return creditosTotales;
	}

	public void setCreditosTotales(int creditosTotales) {
		this.creditosTotales = creditosTotales;
	}

	public int getNumSemestres() {
		return numSemestres;
	}

	public void setNumSemestres(int numSemestres) {
		this.numSemestres = numSemestres;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public Facultad getFacultad() {
		return facultad;
	}

	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
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
