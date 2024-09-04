package P.O.O;

public class ObjetoCarro {

	public static void main(String[] args) {
		
		Carro carros1 = new Carro() ;
		Carro carros2 = new Carro();
		Carro carros3 = new Carro();
		Carro carros4 = new Carro();
		
		carros1.setmodelo("Amarok");
		carros1.setcor("Preto");
		carros1.setmarca("Volkswagen");
		carros1.setquantiPassageiro(5) ;
		
		carros2.setmodelo("hilux");
		carros2.setcor("Preto");
		carros2.setmarca("Toyota");
		carros2.setquantiPassageiro(5) ;
		
		carros3.setmodelo("Saveiro Surf");
		carros3.setcor("Branco");
		carros3.setmarca("Volkswagen");
		carros3.setquantiPassageiro(2) ;
		
		carros4.setmodelo("Sw4");
		carros4.setcor("Preto");
		carros4.setmarca("Toyota");
		carros4.setquantiPassageiro(7) ;
		
		System.out.println("-----OBJETO 1-----");
		System.out.println(carros1.getmodelo() );
		System.out.println(carros1.getmarca());
		System.out.println(carros1.getmarca());
		System.out.println(carros1.getquantiPassageiro());
		
		System.out.println("-----OBJETO 2-----");
		System.out.println(carros2.getmodelo() );
		System.out.println(carros2.getClass());
		System.out.println(carros2.getmarca());
		System.out.println(carros2.getquantiPassageiro());
		
		System.out.println("-----OBJETO 3-----");
		System.out.println(carros3.getmodelo() );
		System.out.println(carros3.getClass());
		System.out.println(carros3.getmarca());
		System.out.println(carros3.getquantiPassageiro());
		
		System.out.println("-----OBJETO 4-----");
		System.out.println(carros4.getmodelo() );
		System.out.println(carros4.getClass());
		System.out.println(carros4.getmarca());
		System.out.println(carros4.getquantiPassageiro());
		
	}}
