package GIT;

public class Teatro extends Establecimiento {
	private String hora;
	private String genero;
	
	public Teatro(String nombre, double precio, int aforo, String descripcion,String hora, String genero) {
		super(nombre, precio, aforo, descripcion);
		this.hora=hora;
		this.genero=genero;
	}
	
	protected String getHora() {
		return hora;
	}

	protected void setHora(String hora) {
		this.hora = hora;
	}
	
	protected String getGenero() {
		return genero;
	}

	protected void setPreciobase(String genero) {
		this.genero = genero;
	}

}
