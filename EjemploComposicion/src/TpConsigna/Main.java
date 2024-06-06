package TpConsigna;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		
		Socio yo = new Socio("1","Gamaliel","lavalle123",9);
		Libro dune = new Libro("1234","Dune","alguien",false);
		Libro harryPotter = new Libro("2222","harryPotter","jk",true);
		Libro NacidosDeLaBruma = new Libro("3333","Mistborn","Sanderson",true);

		Prestamo prestamo1 =  yo.RealizarPrestamo(dune);
		Prestamo prestamo2 = yo.RealizarPrestamo(harryPotter);
		Prestamo prestamo3 = yo.RealizarPrestamo(NacidosDeLaBruma);

		JOptionPane.showMessageDialog(null, prestamo1);
		JOptionPane.showMessageDialog(null, prestamo2);
		JOptionPane.showMessageDialog(null, prestamo3);


	}
}
