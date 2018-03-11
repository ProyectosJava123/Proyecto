package GIT;

public class Administrador extends Persona{
	private String contraseña;
	
	public Administrador(String nombre, String contraseña){
	super(nombre);
		this.contraseña=contraseña;
	}
	
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getContraseña() {
		return contraseña;
	}
	protected void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
}
