import javax.swing.JFrame;

public class PintaCirculo {

	public static void main(String[] args) {
		JFrame app = new JFrame ("Pinta C�rculo.");			//CREA VENTANA
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			//CERRAR AL CERRAR VENTANA
		app.setBounds(0,0,300,300);			//CREA L�MITES
		C�rculoJPanel C = new C�rculoJPanel (150,150,50);			//CREA C�RCULO
		app.add(C);			//A�ADE C�RCULO A VENTANA
		app.setVisible(true);			//HACE VENTANA VISIBLE
	}

}


