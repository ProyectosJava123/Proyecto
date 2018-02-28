package Proyecto;

public class Atracciones extends Establecimiento{
	protected int duracion;
	protected String edad_recomendada;
	protected String altura_recomendada;
	


	public Atracciones(String nombre, double precio, int aforo, String descripcion, int duracion, String altura_recomendada, String edad_recomendada) {
		super(nombre, precio, aforo, descripcion);
		this.duracion = duracion;
		this.edad_recomendada = edad_recomendada;
		this.altura_recomendada = altura_recomendada;
	}

	protected int getDuracion() {
		return duracion;
	}

	protected void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	protected int getDuración() {
		return duracion;
	}

	protected void setDuración(int duración) {
		this.duracion = duración;
	}

	protected String getEdad_recomendada() {
		return edad_recomendada;
	}

	protected void setEdad_recomendada(String edad_recomendada) {
		this.edad_recomendada = edad_recomendada;
	}

	protected String getAltura_recomendada() {
		return altura_recomendada;
	}

	protected void setAltura_recomendada(String altura_recomendada) {
		this.altura_recomendada = altura_recomendada;
	}


	public String toString() {
		return "Atraccion [" + nombre + ", Precio: " + precio + ", duracion=" + duracion + ", aforo=" + aforo 
				+ ", edad_recomendada=" + edad_recomendada + ", altura_recomendada=" + altura_recomendada
				+ ", descripcion=" + descripcion + "]";
	}
	
}

