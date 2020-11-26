/** Representa objetos RectÃ¡ngulo
 *  @author los profesores de IP
 *  @version 1.0  */

//IMPORTAR PARA PINTAR
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class RectanguloJPanel extends JPanel{

//------------------------NUEVAS MODIFICACIONES--------------------------------
	//CONSTRUCTORES
	public RectanguloJPanel() {
		setX(1.0);
		setY(1.0);
		setAltura(1.0);
		setBase(1.0);
	}
	public RectanguloJPanel (double x, double y, double h, double b) {
		setX(x);
		setY(y);
		setAltura(h);
		setBase(b);
	}
	public RectanguloJPanel (RectanguloJPanel R) {
		setX(R.getX());
		setY(R.getY());
		setAltura(R.getAltura());
		setBase(R.getBase());
	}

    public void imprimeRectangulo () {
    	System.out.println(getX());
    	System.out.println(getY());
    	System.out.println(getAltura());
    	System.out.println(getBase());
    	System.out.println();
    }

//---------PINTAR RECTÁNGULO-----------
    public void paintComponent(Graphics g) {
    	super.paintComponent(g);
    	
    	g.setColor(Color.red);
    	g.fillRect(getX(), getY(), (int)getBase(), (int)getAltura());
    	g.setColor(Color.blue);
    	g.drawRect(getX(), getY(), (int)getBase(), (int)getAltura());
    }
    
//-----------------FIN DE MODIFICACIONES------------------------
    
    //Atributos
    /** Representa la coordenada X del RectÃ¡ngulo */
    private double x;
    /** Representa la coordenada Y del RectÃ¡ngulo */
    private double y;
    /** Representa la base del RectÃ¡ngulo */
    private double base;
    /** Representa la altura del RectÃ¡ngulo */
    private double altura;
 
    //MÃ©todos pÃºblicoS    
    public void setX(double x) {
        x = x;
    }	
    
    /** Cambia el valor de la coordenada y del RectÃ¡ngulo
      * @param y nuevo valor para la coordenada y   */
    public void setY(double v) {
        y = v;
    }	

    /** Devuelve el valor de la base del RectÃ¡ngulo
     * @return el valor de base  */
    public double getBase() {
        return base;
    }

    /** Cambia el valor de la base del RectÃ¡ngulo
     * @param v nuevo valor para la base   */
    public void setBase(double v) {
        if (v > 0 ) base = v;
    }	

    /** Devuelve el valor de la altura del RectÃ¡ngulo
      * @return el valor de altura  */
	public double getAltura() {
       return altura;
    }

	/** Cambia el valor de la altura del RectÃ¡ngulo
     * @param v nuevo valor para la altura   */
    public void setAltura(double v) {
        if (v > 0 ) altura = v;
    }		

    /**Calcula el Ã¡rea del RectÃ¡ngulo
     * @return el Ã¡rea */ 
    public double calculaArea() {
        return getBase()*getAltura();
    }

    /**Calcula el perÃ­metro del RectÃ¡ngulo
     * @return el perÃ­metro */ 
    public double calculaPerÃ­metro() {
        return getBase()*2+getAltura()*2;
	}	
}

