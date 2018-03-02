package GIT;

public class Persona {
	protected String nombre;
	protected int edad;
	protected double altura;
	protected double peso;
	protected String dni;
	protected double entrada;
	
	public Persona(String nombre, int edad, double altura, String dni){
		this.nombre=nombre;
		this.edad=edad;
		this.altura=altura;
		this.dni=dni;
	}
	
	public Persona(String nombre, int edad, String dni){
		this.nombre=nombre;
		this.edad=edad;
		this.dni=dni;
	}

	protected String getNombre() {
		return nombre;
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
				+ ", Pagará como entrada: " + entrada + "€";
	}
	
	
	
}
