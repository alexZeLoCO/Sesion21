
public class Rect�nguloPrueba {

	public static void main(String[] args) {
		Rectangulo r1=new Rectangulo();					//CREA RECT�NGULO SIN PAR�METROS ==> 1.0 1.0 1.0 1.0
		Rectangulo r2=new Rectangulo(2,3,5,1);			//CREA RECT�NGULO CON PAR�METROS ==> 2 3 5 1
		Rectangulo r3=new Rectangulo(r2);				//CREA RECT�NGULO COPIA DE R2
		
				//IMPRIME RECT�NGULOS
		r1.imprimeRectangulo();
		r2.imprimeRectangulo();
		r3.imprimeRectangulo();
	}

}
