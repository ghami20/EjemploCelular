package TpConsigna;

public class Libro {
	private String isbn;
	private String título;
	private String autor;
	private boolean disponible;
	public Libro(String isbn, String título, String autor, boolean disponible) {
		super();
		this.isbn = isbn;
		this.título = título;
		this.autor = autor;
		this.disponible = disponible;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTítulo() {
		return título;
	}
	public void setTítulo(String título) {
		this.título = título;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", título=" + título + ", autor=" + autor + ", disponible=" + disponible + "]";
	}
	
	
}
