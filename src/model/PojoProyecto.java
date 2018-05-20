package model;

public class PojoProyecto {
	private int id;
	private String nombre;
	private String grupo;
	private int anyo;
	private String curso;
	private int nota;
	private String ciclo;
	private String url;
	
	public PojoProyecto(String nombre, String grupo, int anyo, String curso, int nota, String ciclo, String url) {
		this.nombre = nombre;
		this.grupo = grupo;
		this.anyo = anyo;
		this.curso = curso;
		this.nota = nota;
		this.ciclo = ciclo;
		this.url = url;
	}
	
	public PojoProyecto(int id, String nombre, String grupo, int anyo, String curso, int nota, String ciclo, String url) {
		this.id = id;
		this.nombre = nombre;
		this.grupo = grupo;
		this.anyo = anyo;
		this.curso = curso;
		this.nota = nota;
		this.ciclo = ciclo;
		this.url = url;
	}

	public String getNombre() {
		return nombre;
	}

	public String getGrupo() {
		return grupo;
	}

	public int getAnyo() {
		return anyo;
	}

	public String getCurso() {
		return curso;
	}

	public int getNota() {
		return nota;
	}

	public String getCiclo() {
		return ciclo;
	}

	public String getUrl() {
		return url;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + " , Nota: " + nota;
	}
	
	
}
