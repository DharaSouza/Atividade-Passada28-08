package P.O.O;

public class ObjetoAviao {
	public static void main(String[] args) {

	Aviao aviao1 = new Aviao () ;
	Aviao aviao2 = new Aviao ();
	Aviao aviao3 = new Aviao ();
	Aviao aviao4 = new Aviao ();
	
	aviao1.setcompania ("gol");
	aviao1.setAssentos (102) ;
	aviao1.setturbina ("sim") ;
	aviao1.setpassageiros(56) ;
	
	aviao2.setcompania ("latam");
	aviao2.setAssentos (102) ;
	aviao2.setturbina ("sim") ;
	aviao2.setpassageiros(88) ;
	
	aviao3.setcompania ("phenom 300");
	aviao3.setAssentos (50) ;
	aviao3.setturbina ("sim") ;
	aviao3.setpassageiros(35) ;
	
	aviao4.setcompania ("azul");
	aviao4.setAssentos (102) ;
	aviao4.setturbina ("sim") ;
	aviao4.setpassageiros(100) ;
	
	
	System.out.println("-----OBJETO 1-----");
	System. out.println (aviao1.getCompania () );
	System. out.println (aviao1.getAssentos ());
	System. out.println (aviao1.getturbina ());
	System. out.println (aviao1.getpassageiros());
	
	System.out.println("-----OBJETO 2-----");
	System. out.println (aviao2.getCompania () );
	System. out.println (aviao2.getAssentos ());
	System. out.println (aviao2.getturbina());
	System. out.println (aviao2.getpassageiros());
	
	System.out.println("-----OBJETO 3-----");
	System. out.println (aviao3.getCompania () );
	System. out.println (aviao3.getAssentos ());
	System. out.println (aviao3.getturbina());
	System. out.println (aviao3.getpassageiros());
	
	System.out.println("-----OBJETO 4-----");
	System. out.println (aviao4.getCompania () );
	System. out.println (aviao4.getAssentos ());
	System. out.println (aviao4.getturbina());
	System. out.println (aviao4.getpassageiros());
	}
	

	}


