
public class CirculoPrueba {

	public static void main(String[] args) {
		Circulo c1=new Circulo ();			//CREA C�RCULO (SIN PAR�METROS ==> VALORES 1.0 1.0 1.0)
		Circulo c2=new Circulo (2,4,10);		//CREA C�RUCLO CON PAR�METROS 2 4 10
		Circulo c3=new Circulo (c2);		//CREA C�RCULO COPIA DEL C2
		
		//IMPRIME C�RCULOS
		c1.imprimeCirculo();		
		c2.imprimeCirculo();
		c3.imprimeCirculo();

	}

}
