package GIT;

public class Administrador extends Persona{
	private String contrase�a;
	
	public Administrador(String nombre, String contrase�a){
	super(nombre);
		this.contrase�a=contrase�a;
	}
	
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getContrase�a() {
		return contrase�a;
	}
	protected void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
}
