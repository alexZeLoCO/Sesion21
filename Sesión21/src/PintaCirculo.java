import javax.swing.JFrame;

public class PintaCirculo {

	public static void main(String[] args) {
		JFrame app = new JFrame ("Pinta Círculo.");			//CREA VENTANA
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			//CERRAR AL CERRAR VENTANA
		app.setBounds(0,0,300,300);			//CREA LÍMITES
		CírculoJPanel C = new CírculoJPanel (150,150,50);			//CREA CÍRCULO
		app.add(C);			//AÑADE CÍRCULO A VENTANA
		app.setVisible(true);			//HACE VENTANA VISIBLE
	}

}


