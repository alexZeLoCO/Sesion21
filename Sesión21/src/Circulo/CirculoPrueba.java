
public class CirculoPrueba {

	public static void main(String[] args) {
		Circulo c1=new Circulo ();			//CREA CÍRCULO (SIN PARÁMETROS ==> VALORES 1.0 1.0 1.0)
		Circulo c2=new Circulo (2,4,10);		//CREA CÍRUCLO CON PARÁMETROS 2 4 10
		Circulo c3=new Circulo (c2);		//CREA CÍRCULO COPIA DEL C2
		
		//IMPRIME CÍRCULOS
		c1.imprimeCirculo();		
		c2.imprimeCirculo();
		c3.imprimeCirculo();

	}

}
