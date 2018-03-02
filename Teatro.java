package GIT;

public class Teatro extends Establecimiento {
	private int hora;
	private String genero;
	
	public Teatro(String nombre, double precio, int aforo, String descripcion,int hora, String genero) {
		super(nombre, precio, aforo, descripcion);
		this.hora=hora;
		this.genero=genero;
	}
	
	protected double getHora() {
		return hora;
	}

	protected void setHora(int hora) {
		this.hora = hora;
	}
	
	protected String getGenero() {
		return genero;
	}

	protected void setPreciobase(String genero) {
		this.genero = genero;
	}

}
