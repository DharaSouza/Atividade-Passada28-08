package P.O.O;

public class ObjetoCliente {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		
		cliente1.setid(123456789);
		cliente1.setNome("Maria Clara de Oliveira Correa ");
		cliente1.setUsuario("MaCorrea");
		cliente1.setSenha(19072006);
		cliente1.setPermissao("Acesso liberado");
		
		cliente2.setid(987654321);
		cliente2.setNome("Dharana Rodrigues de Souza");
		cliente2.setUsuario("DharaSouza");
		cliente2.setSenha(07052007);
		cliente2.setPermissao("Acesso liberado");
		
		System.out.println("-----OBJETO 1-----");
		System.out.println(cliente1.getid());
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getUsuario());
		System.out.println(cliente1.getSenha());
		System.out.println(cliente1.getPermissao());
		
		System.out.println("-----OBJETO 2-----");
		System.out.println(cliente2.getid());
		System.out.println(cliente2.getNome());
		System.out.println(cliente2.getUsuario());
		System.out.println(cliente2.getSenha());
		System.out.println(cliente2.getPermissao());

		
	}
	

}
