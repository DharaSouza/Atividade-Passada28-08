package P.O.O;

public class ObjetoAnimal {

	public static void main(String[] args) {
		Animal animal1 = new Animal();
		Animal animal2 = new Animal();
		Animal animal3 = new Animal();
		Animal animal4 = new Animal();
		Animal animal5 = new Animal();
		Animal animal6 = new Animal();
		Animal animal7 = new Animal();
		Animal animal8 = new Animal();
		
		animal1.setEspecie("Vaca");
		animal1.setSexo("Femea");
		animal1.setRaca("Holstein-Frísia");
		animal1.setPorte("Grande");
		animal1.setSom("Mugir ");
		animal1.setReproducao("Sim");
		animal1.setQuantPatas(4);
		animal1.setProducao("Leite");
		
		animal2.setEspecie("Boi");
		animal2.setSexo("Macho");
		animal2.setRaca("Holstein-Frísia");
		animal2.setPorte("Pequeno");
		animal2.setSom("Mugir ");
		animal2.setReproducao("não");
		animal2.setQuantPatas(4);
		animal2.setProducao("Corte ou Reprodução");
		
		animal3.setEspecie("Cachorro");
		animal3.setSexo("Macho");
		animal3.setRaca("Pastor Alemao");
		animal3.setPorte("Pequeno");
		animal3.setSom("Late ");
		animal3.setReproducao("não");
		animal3.setQuantPatas(4);
		animal3.setProducao("reprodução");
		
		animal4.setEspecie("Coelho");
		animal4.setSexo("femea");
		animal4.setRaca("Coelho rex");
		animal4.setPorte("Pequeno");
		animal4.setSom("Chiar");
		animal4.setReproducao("Sim");
		animal4.setQuantPatas(4);
		animal4.setProducao("reprodução");
		
		animal5.setEspecie("Coelho");
		animal5.setSexo("Macho");
		animal5.setRaca("Coelho rex");
		animal5.setPorte("Pequeno");
		animal5.setSom("Chiar");
		animal5.setReproducao("não");
		animal5.setQuantPatas(4);
		animal5.setProducao("reprodução");
		
		animal6.setEspecie("Ovelha");
		animal6.setSexo("femea");
		animal6.setRaca("Dorper");
		animal6.setPorte("Médio");
		animal6.setSom("balidos");
		animal6.setReproducao("Sim");
		animal6.setQuantPatas(4);
		animal6.setProducao("reprodução");
	
		animal7.setEspecie("Galinha");
		animal7.setSexo("femea");
		animal7.setRaca("Brahma");
		animal7.setPorte("Pequena");
		animal7.setSom("Cacareja");
		animal7.setReproducao("Sim");
		animal7.setQuantPatas(2);
		animal7.setProducao("reprodução");
	
		animal8.setEspecie("Pintinho");
		animal8.setSexo("femea ou macho");
		animal8.setRaca("Brahma");
		animal8.setPorte("Pequeno");
		animal8.setSom("Pia");
		animal8.setReproducao("não");
		animal8.setQuantPatas(2);
		animal8.setProducao("Corte e Reproduçaõ");
		
		System.out.println("-----OBJETO 1-----");
		System.out.println(animal1.getEspecie());
		System.out.println(animal1.getSexo());
		System.out.println(animal1.getRaca());
		System.out.println(animal1.getPorte());
		System.out.println(animal1.getSom());
		System.out.println(animal1.getReproducao());
		System.out.println(animal1.getQuantPatas());
		System.out.println(animal1.getProducao());
		
		System.out.println("-----OBJETO 2-----");
		System.out.println(animal2.getEspecie());
		System.out.println(animal2.getSexo());
		System.out.println(animal2.getRaca());
		System.out.println(animal2.getPorte());
		System.out.println(animal2.getSom());
		System.out.println(animal2.getReproducao());
		System.out.println(animal2.getQuantPatas());
		System.out.println(animal2.getProducao());
		
		System.out.println("-----OBJETO 3-----");
		System.out.println(animal3.getEspecie());
		System.out.println(animal3.getSexo());
		System.out.println(animal3.getRaca());
		System.out.println(animal3.getPorte());
		System.out.println(animal3.getSom());
		System.out.println(animal3.getReproducao());
		System.out.println(animal3.getQuantPatas());
		System.out.println(animal3.getProducao());
		
		System.out.println("-----OBJETO 4-----");
		System.out.println(animal4.getEspecie());
		System.out.println(animal4.getSexo());
		System.out.println(animal4.getRaca());
		System.out.println(animal4.getPorte());
		System.out.println(animal4.getSom());
		System.out.println(animal4.getReproducao());
		System.out.println(animal4.getQuantPatas());
		System.out.println(animal4.getProducao());
		
		System.out.println("-----OBJETO 5-----");
		System.out.println(animal5.getEspecie());
		System.out.println(animal5.getSexo());
		System.out.println(animal5.getRaca());
		System.out.println(animal5.getPorte());
		System.out.println(animal5.getSom());
		System.out.println(animal5.getReproducao());
		System.out.println(animal5.getQuantPatas());
		System.out.println(animal5.getProducao());
		
		System.out.println("-----OBJETO 6-----");
		System.out.println(animal6.getEspecie());
		System.out.println(animal6.getSexo());
		System.out.println(animal6.getRaca());
		System.out.println(animal6.getPorte());
		System.out.println(animal6.getSom());
		System.out.println(animal6.getReproducao());
		System.out.println(animal6.getQuantPatas());
		System.out.println(animal6.getProducao());
		
		System.out.println("-----OBJETO 7-----");
		System.out.println(animal7.getEspecie());
		System.out.println(animal7.getSexo());
		System.out.println(animal7.getRaca());
		System.out.println(animal7.getPorte());
		System.out.println(animal7.getSom());
		System.out.println(animal7.getReproducao());
		System.out.println(animal7.getQuantPatas());
		System.out.println(animal7.getProducao());
		
		System.out.println("-----OBJETO 8-----");
		System.out.println(animal8.getEspecie());
		System.out.println(animal8.getSexo());
		System.out.println(animal8.getRaca());
		System.out.println(animal8.getPorte());
		System.out.println(animal8.getSom());
		System.out.println(animal8.getReproducao());
		System.out.println(animal8.getQuantPatas());
		System.out.println(animal8.getProducao());

	}

}
