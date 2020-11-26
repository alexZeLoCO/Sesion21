package Circulo;
/** Representa objetos CÃ­rculo, con un campo Radio
 *  @author los profesores de IP
 *  @version 1.0  */

public class Circulo {
	
	//CONSTRUCTORES
	public Circulo() {
		setX(1.0);
		setY(1.0);
		setRadio(1.0);
	}
	public Circulo(double x, double y, double r) {
		setX(x);
		setY(y);
		setRadio(r);
	}
	public Circulo(Circulo c) {
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
	
	/**Valor del radio del objeto CÃ­rculo*/
	private double radio;
	private double x;
	private double y;
	
	/**Constante matemÃ¡tica pi */
	private static final double PI=3.1416;
	
	/**Devuelve el valor del radio del objeto CÃ­rculo
	 * @return el radio del objeto */
	public double getRadio() {
		return radio;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
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

	/**Devuelve el Ã¡rea del objeto CÃ­rculo
	 * @return el valor del Ã¡rea del CÃ­rculo*/
	public double calculaArea() {
		return PI*radio*radio;
	}
	public double calculaPerÃ­metro() {
		return 2*PI*radio;
	}
	public void copiaCentro(Circulo c) {
		this.setX(c.getX());
		this.setY(c.getY());
	}

	public void ajustaRadio(Circulo c) {
		double d = Math.sqrt(Math.pow(this.x-c.x,2)
				+Math.pow(this.y-c.y,2));
		this.setRadio(d);
	}
}
