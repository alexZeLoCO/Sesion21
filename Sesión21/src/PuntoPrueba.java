
public class PuntoPrueba {

	public static void main(String[] args) {
		Punto p1=new Punto();			//CREA PUNTO SIN PARÁMETROS ==> 1.0 1.0
		Punto p2=new Punto(5,3);		//CREA PUNTO CON PARÁMETROS 5 3
		Punto p3=new Punto(p2);			//CREA PUNTO COPIA DE P2
		
				//IMPRIME PUNTOS
		p1.imprimePunto();		
		p2.imprimePunto();
		p3.imprimePunto();
	}

}
