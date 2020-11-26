
public class CirculoPrueba {

	public static void main(String[] args) {
		Círculo c1=new Círculo ();			//CREA CÍRCULO (SIN PARÁMETROS ==> VALORES 1.0 1.0 1.0)
		Círculo c2=new Círculo (2,4,10);		//CREA CÍRUCLO CON PARÁMETROS 2 4 10
		Círculo c3=new Círculo (c2);		//CREA CÍRCULO COPIA DEL C2
		
		//IMPRIME CÍRCULOS
		c1.imprimeCírculo();		
		c2.imprimeCírculo();
		c3.imprimeCírculo();

	}

}
