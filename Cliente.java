package GIT;

public class Cliente extends Persona{
	private int edad;
	private double altura;
	private double peso;
	private String dni;
	private double entrada;
	private String servicio;
	
	public Cliente(String nombre, int edad, double altura, String dni){
		super(nombre);
		this.edad=edad;
		this.altura=altura;
		this.dni=dni;
	}
	
	public Cliente(String nombre, int edad, String dni){
		super(nombre);
		this.edad=edad;
		this.dni=dni;
	}
	
	protected String getNombre() {
		return nombre;
	}
	
	protected String getServicio() {
		return servicio;
	}

	protected void setServicio(String servicio) {
		this.servicio = servicio;
	}

	protected double getEntrada() {
		return entrada;
	}

	protected void setEntrada(double entrada) {
		this.entrada = entrada;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected int getEdad() {
		return edad;
	}

	protected void setEdad(int edad) {
		this.edad = edad;
	}
	
	protected void setAltura(double altura){
		this.altura = altura;
	}
	
	protected double getAltura(){
		return altura;
	}


	protected String getDni() {
		return dni;
	}

	protected void setDni(String dni) {
		this.dni = dni;
	}
	
	@Override
	public String toString() {
		return "Entrada: " + nombre + ", edad=" + edad + ", altura:" + altura + ", peso:" + peso + ", dni:" + dni
				+" Servicio: " +servicio  + ", Pagará como entrada: " + entrada + "€";
	}
	
	public String toStringTeatro() {
		return "Entrada: " + nombre + ", edad=" + edad + ", dni:" + dni
				+ ", Pagará como entrada: " +" Servicio: " +servicio + entrada + "€";
	}
	
}
