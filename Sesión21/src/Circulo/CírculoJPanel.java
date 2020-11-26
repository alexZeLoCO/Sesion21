package Circulo;

//IMPORTAR PARA PINTAR
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class CírculoJPanel extends JPanel {
	
//--------------------NUEVAS MODIFICACIONES--------------------------
	//CONSTRUCTORES
	public CírculoJPanel() {
		setX(1.0);
		setY(1.0);
		setRadio(1.0);
	}
	public CírculoJPanel(double x, double y, double r) {
		setX(x);
		setY(y);
		setRadio(r);
	}
	public CírculoJPanel(CírculoJPanel c) {
		setX(c.getX());
		setY(c.getY());
		setRadio(c.getRadio());
	}
	
	public void imprimeCirculo() {
		System.out.println(getX());
		System.out.println(getY());
		System.out.println(getRadio());
		System.out.println();
	}
	

//--------PINTA CÃ�RCULO-------------
	public void paintComponent (Graphics g) {
    	super.paintComponent(g);
    	
    	g.setColor(Color.red);
    	g.fillOval((int)getX(),(int) getY(),(int) getRadio()*2,(int) getRadio()*2);
    	g.setColor(Color.blue);
    	g.drawOval((int)getX(),(int) getY(),(int) getRadio()*2,(int) getRadio()*2);
	}

//------------------------FIN DE MODIFICACIONES----------------------------------------
	
	/**Valor del radio del objeto CÃƒÂ­rculo*/
	private double radio;
	private double x;
	private double y;
	
	/**Constante matemÃƒÂ¡tica pi */
	private static final double PI=3.1416;
	
	/**Devuelve el valor del radio del objeto CÃƒÂ­rculo
	 * @return el radio del objeto */
	public double getRadio() {
		return radio;
	}

	/**Cambia el valor del radio del objeto, para que valga r
	 * @param r nuevo valor para el radio del objeto 
	 * @return nada  */
	public void setRadio(double r) {
		if(r >= 0) radio=r;
	}	
	public void setX(double nuevaX) {
		x = nuevaX;
	}
	public void setY(double nuevaY) {
		y = nuevaY;
	}

	/**Devuelve el ÃƒÂ¡rea del objeto CÃƒÂ­rculo
	 * @return el valor del ÃƒÂ¡rea del CÃƒÂ­rculo*/
	public double calculaArea() {
		return PI*radio*radio;
	}
	public double calculaPerimetro() {
		return 2*PI*radio;
	}
	public void copiaCentro(CírculoJPanel c) {
		this.setX(c.getX());
		this.setY(c.getY());
	}

	public void ajustaRadio(CírculoJPanel c) {
		double d = Math.sqrt(Math.pow(this.x-c.x,2)
				+Math.pow(this.y-c.y,2));
		this.setRadio(d);
	}
}
