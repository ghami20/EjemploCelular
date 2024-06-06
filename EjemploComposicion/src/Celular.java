import javax.swing.JOptionPane;

public class Celular {

	private Dueño dueño;
	private String imei;
	private String modelo;
	private int bateria;
	private String contactos;

	public Celular(Dueño dueño, String imei, String modelo, int bateria) {
		super();
		this.dueño = dueño;
		this.imei = imei;
		this.modelo = modelo;
		this.bateria = bateria;
	}
	
	public String getContactos() {
		return contactos;
	}

	public void setContactos(String contactos) {
		this.contactos = contactos;
	}

	public Dueño getDueño() {
		return dueño;
	}
	public void setDueño(Dueño dueño) {
		this.dueño = dueño;
	}
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getBateria() {
		return bateria;
	}
	public void setBateria(int bateria) {
		this.bateria = bateria;
	}
	@Override
	public String toString() {
		return "Celular [dueño=" + dueño + ", imei=" + imei + ", modelo=" + modelo + ", bateria=" + bateria + "]";
	}
	public boolean Llamar(Celular receptor , int duracion) {
		if (this.contactos.contains(receptor.getDueño().getNumero())) {
			
			if (receptor.getBateria()>=1 && receptor.getBateria()>=duracion) {
				
				JOptionPane.showMessageDialog(null, "Realizando llamada con contacto " + receptor.getDueño().getNombre()+ "....");
			} else {
				JOptionPane.showMessageDialog(null, "El celular de "  + receptor.getDueño().getNombre() +" no tiene bateria suficiente para llamar");
			}
			
		} else {
			JOptionPane.showMessageDialog(null, "No esta en mis contactos, no se puede llamar");
		}
		return true;
	}
	public boolean AgregarContacto(String nuevocontacto) {
		if (contactos==null) {
			 contactos = nuevocontacto + "\n";
			return true;

		} else {
			if (contactos.contains(nuevocontacto)) {
				return false;
			} else {
				contactos = contactos + nuevocontacto + "\n";
				return true;

			}
		}
		
	}
	
}
