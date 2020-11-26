import javax.swing.JFrame;

public class PintaRectangulo {

	public static void main(String[] args) {
		JFrame app = new JFrame ("Pinta Rectángulo.");		//CREA VENTANA	
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			//CERAR AL CERRAR
		app.setBounds(0,0,300,200);			//CREA LÍMITES
		RectanguloJPanel R = new RectanguloJPanel (40,25,200,100);		//CREA RECTÁNGULO
		app.add(R);			//AÑADE RECTÁNGULO A VENTANA
		app.setVisible(true);			//HACER VENTANA VISIBLE
	}

}
