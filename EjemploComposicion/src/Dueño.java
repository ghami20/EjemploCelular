
public class Dueño {

	private String numero;
	private String dni;
	private String nombre;
	public Dueño(String numero, String dni,String nombre) {
		super();
		this.numero = numero;
		this.dni = dni;
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Dueño [numero=" + numero + ", dni=" + dni + ", nombre=" + nombre + "]";
	}

	
	
	
	
	
	
}
