package model;

public class PojoProyecto {
	private String nombre;
	private String grupo;
	private int anyo;
	private String curso;
	private int nota;
	private String ciclo;
	private String url;
	
	public PojoProyecto(String nombre, String grupo, int anyo, String curso, int nota, String ciclo, String url) {
		super();
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
	
}
