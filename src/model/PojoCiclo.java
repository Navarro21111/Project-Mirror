package model;

public class PojoCiclo {
	private String nombre;
	private String descripcion;
	
	public PojoCiclo(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + ", descripcion: " + descripcion;
	}
}
