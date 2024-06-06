import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		
		Dueño julian = new Dueño("12345678","1234","Julian");
		Dueño francisco = new Dueño("87654321","4321","francisco");
		
		Celular iphone = new Celular(julian,"1ds12132","13 pro",59);
		Celular Android = new Celular(francisco,"1ds12132","galaxy ",59);

		
		String[] menu = {
				"iphone","Android","Salir"
		};
		String[] opcionesDeCelular = {
				"Guardar contacto","Ver contactos","Llamar","Salir"
		};
		int opcion = 0;
		int opcionCelular = 0;
		do {
			opcion = JOptionPane.showOptionDialog(null, "Elija una opción", null, opcion, opcion, null, menu, menu[0]);
			switch (opcion) {
			case 0:
				
				JOptionPane.showMessageDialog(null, iphone);
				
				do {
					opcionCelular = JOptionPane.showOptionDialog(null, "Que desea hacer hoy", null, 0, 0, null, opcionesDeCelular, opcionesDeCelular[0]);
					
					switch (opcionCelular) {
					case 0:
					
						String contacto = JOptionPane.showInputDialog("Ingrese contacto");
						
						
						if (iphone.AgregarContacto(contacto)) {
							JOptionPane.showMessageDialog(null, "Se agrega");
						} else {
							JOptionPane.showMessageDialog(null, "Se agrega");

						} 
						break;
					case 1:
						
						JOptionPane.showMessageDialog(null, iphone.getContactos());						
						break;
					case 2:
						String[] contactos = iphone.getContactos().split("\n");
					String elegido = (String)	JOptionPane.showInputDialog(null, "Seleccionar contacto", null, 0, null, contactos, contactos[0]);
					
						int minutos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los minutos de duracion"));
						 iphone.Llamar(Android, minutos);
					 break;
					
					case 3:
						JOptionPane.showMessageDialog(null, "Salir");
						 break;
					default:
						break;
					}
				} while (opcionCelular!=3);
				
				
				break;
			case 1:

				JOptionPane.showMessageDialog(null, Android);
				opcionCelular = JOptionPane.showOptionDialog(null, "Que desea hacer hoy", null, 0, 0, null, opcionesDeCelular, opcionesDeCelular[0]);
			
				do {
					switch (opcionCelular) {
					case 0:
					
						String contacto = JOptionPane.showInputDialog("Ingrese contacto");
						
						
						if (Android.AgregarContacto(contacto)) {
							JOptionPane.showMessageDialog(null, "Se agrega");
						} else {
							JOptionPane.showMessageDialog(null, "Se agrega");

						} 
						break;
					case 1:
						
JOptionPane.showMessageDialog(null, Android.getContactos());						
						break;
					case 2:
						String[] contactos = Android.getContactos().split("\n");
					String elegido = (String)	JOptionPane.showInputDialog(null, "Seleccionar contacto", null, 0, null, contactos, contactos[0]);
					break;
					case 3:
						int minutos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los minutos de duracion"));
						Android.Llamar(Android, minutos);
					 break;
					default:
						break;
					}
				} while (opcionCelular!=3);
				
				
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Salir");
				break;
			default:
				break;
			}
		
		
		} while (opcion!=2);
		
		
		
	}

}
