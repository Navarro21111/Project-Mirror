package model;

public class PojoLogin {
	private String usuario;
	private String contrasenia;
	
	public PojoLogin(String usuario, String contrasenia) {
		this.usuario = usuario;
		this.contrasenia = contrasenia;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}
}
