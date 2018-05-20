package model;

public class PojoCiclo {
	private String nombre;
	private String descripcion;
	private int id;
	
	public PojoCiclo(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	public PojoCiclo(int id, String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", descripcion: " + descripcion;
	}
}
