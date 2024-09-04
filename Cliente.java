package P.O.O;

public class Cliente {
	int id;
	String Nome;
	String Usuario;
	int Senha;
	String Permissao;
	String AutualizarDados;
	String DesativarConta;
	String AtualizacaodaSenha;

	public int getid () {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getNome () {
		return Nome;
	}
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	public String getUsuario () {
		return Usuario;
	}
	public void setUsuario(String Usuario) {
		this.Usuario= Usuario;
	}
	public int getSenha() {
		return Senha;
	}
	public void setSenha (int Senha) {
		this.Senha = Senha;
	}
	public String getPermissao () {
		return Permissao;
	}
	public void setPermissao(String Permissao) {
		this.Permissao = Permissao;
	}
		public String getAutualizarDados () {
			return AutualizarDados;
		}
		public void setAutualizarDadoso(String AutualizarDados) {
			this.AutualizarDados = AutualizarDados;
		}
		public String getDesativarConta () {
			return DesativarConta;
		}
		public void setDesativarConta(String DesativarConta) {
			this.DesativarConta = DesativarConta;
		}
		public String getAtualizacaodaSenha () {
			return AtualizacaodaSenha;
		}
		public void setAtualizacaodaSenha(String AtualizacaodaSenha) {
			this.AtualizacaodaSenha = AtualizacaodaSenha;
}}

