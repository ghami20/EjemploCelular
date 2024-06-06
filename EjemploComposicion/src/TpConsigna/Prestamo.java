package TpConsigna;

public class Prestamo {
	private String numeroSocio;
	private String isbn;
	private String fecha;
	public Prestamo(String numeroSocio, String isbn, String fecha) {
		super();
		this.numeroSocio = numeroSocio;
		this.isbn = isbn;
		this.fecha = fecha;
	}
	public String getNumeroSocio() {
		return numeroSocio;
	}
	public void setNumeroSocio(String numeroSocio) {
		this.numeroSocio = numeroSocio;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Prestamo [numeroSocio=" + numeroSocio + ", isbn=" + isbn + ", fecha=" + fecha + "]";
	}
	
}
