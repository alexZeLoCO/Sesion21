
public class RectánguloPrueba {

	public static void main(String[] args) {
		Rectangulo r1=new Rectangulo();					//CREA RECTÁNGULO SIN PARÁMETROS ==> 1.0 1.0 1.0 1.0
		Rectangulo r2=new Rectangulo(2,3,5,1);			//CREA RECTÁNGULO CON PARÁMETROS ==> 2 3 5 1
		Rectangulo r3=new Rectangulo(r2);				//CREA RECTÁNGULO COPIA DE R2
		
				//IMPRIME RECTÁNGULOS
		r1.imprimeRectangulo();
		r2.imprimeRectangulo();
		r3.imprimeRectangulo();
	}

}
