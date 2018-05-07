package model;

public class PojoAlumno {

	private int nExp;//es el numero de expediente
	private String nombre;//es el nombre del alumno
	private String apellido1;//es el primer apellido
	private String apellido2;//es el segundo apellido
	
	public PojoAlumno(int nExp, String nombre, String apellido1, String apellido2) {
		this.nExp = nExp;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
	}
	
	public int getnExp() {
		return nExp;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido1() {
		return apellido1;
	}
	
	public String getApellido2() {
		return apellido2;
	}

	@Override
	public String toString() {
		return "Expediente: " + nExp + " Nombre: " + nombre  + " " + apellido1 + " " + apellido2;
	}
	
	
}