
public class CirculoPrueba {

	public static void main(String[] args) {
		C�rculo c1=new C�rculo ();			//CREA C�RCULO (SIN PAR�METROS ==> VALORES 1.0 1.0 1.0)
		C�rculo c2=new C�rculo (2,4,10);		//CREA C�RUCLO CON PAR�METROS 2 4 10
		C�rculo c3=new C�rculo (c2);		//CREA C�RCULO COPIA DEL C2
		
		//IMPRIME C�RCULOS
		c1.imprimeC�rculo();		
		c2.imprimeC�rculo();
		c3.imprimeC�rculo();

	}

}
