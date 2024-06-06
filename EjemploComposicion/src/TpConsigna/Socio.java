package TpConsigna;

import javax.swing.JOptionPane;

public class Socio {
	private String numeroSocio;
	private String nombre;
	private String direccion;
	private int cantidadLibros;
	
	
	
	public Socio(String numeroSocio, String nombre, String direccion, int cantidadLibros) {
		super();
		this.numeroSocio = numeroSocio;
		this.nombre = nombre;
		this.direccion = direccion;
		this.cantidadLibros = cantidadLibros;
	}
	public String getNumeroSocio() {
		return numeroSocio;
	}
	public void setNumeroSocio(String numeroSocio) {
		this.numeroSocio = numeroSocio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getCantidadLibros() {
		return cantidadLibros;
	}
	public void setCantidadLibros(int cantidadLibros) {
		this.cantidadLibros = cantidadLibros;
	}
	@Override
	public String toString() {
		return "Socio [numeroSocio=" + numeroSocio + ", nombre=" + nombre + ", direccion=" + direccion
				+ ", cantidadLibros=" + cantidadLibros + "]";
	}
	
	
	public Prestamo RealizarPrestamo(Libro libro) {
		if (this.getCantidadLibros()>=10) {
			JOptionPane.showMessageDialog(null, "No puede pedir más libros");
			return null;

		} else {
			if (libro.isDisponible()) {
				this.cantidadLibros++;
				JOptionPane.showMessageDialog(null, "Prestamo realizado con exito");
				return new Prestamo(this.getNumeroSocio(),libro.getIsbn(),"2024/6/6");

			} else {
				JOptionPane.showMessageDialog(null, "No esta disponible");
				return null;
			}

		}
		
		
	}
	
}
