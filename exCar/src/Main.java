import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		
		Cotxe car1 = new Cotxe();
		
		System.out.println("Introduce la marca del Coche");
		car1.setMarca(sc.next());

		System.out.println("Introduce el mode del Coche");
		car1.setModelo(sc.next());
		

		System.out.println("Introduce el numero de cilindros");
		car1.setnCilindros(sc.nextInt());
		

		System.out.println("Introduce la cilindrada");
		car1.setCilindrada(sc.nextInt());

		System.out.println("El coche "+ car1.getMarca() + " tiene "+ car1.potFiscal());
		
		
		CotxeHibrid car2 = new CotxeHibrid();
		
		System.out.println("Introduce la marca del Coche");
		car2.setMarca(sc.next());

		System.out.println("Introduce el mode del Coche");
		car2.setModelo(sc.next());
		

		System.out.println("Introduce el numero de cilindros");
		car2.setnCilindros(sc.nextInt());
		

		System.out.println("Introduce la cilindrada");
		car2.setCilindrada(sc.nextInt());

		car1.potFiscal();
		System.out.println("El coche Hibrido "+ car2.getMarca() + " tiene "+ car2.potFiscal());

		
	}

}
