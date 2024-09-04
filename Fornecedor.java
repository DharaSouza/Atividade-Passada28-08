package P.O.O;

public class Fornecedor {

	int Id;
	String RazaoSocial;
	String NomeFantazia;
	int CNPJ;
	String Endereço;
	int Telefone;
	String Email;
	String InscricaoEstadual;
	String  CancelarCadastro;
	String AtualizarDados;
	

	public int getId () {
		return Id;
	}
	public void setId(int Id) {
		this.Id = Id;
	}
	public int getCNPJ () {
		return CNPJ;
	}
	public void setCNPJ(int CNPJ) {
		this.CNPJ = CNPJ;
	}
	public int getTelefone () {
		return Telefone;
	}
	public void setTelefone(int Telefone) {
		this.Telefone= Telefone;
	}
	public String getRazaoSocial () {
		return RazaoSocial;
	}
	public void setRazaoSocial(String RazaoSocial) {
		this.RazaoSocial = RazaoSocial;
	}
	public String getNomeFantazial () {
		return NomeFantazia;
	}
	public void setNomeFantazia(String NomeFantazia) {
		this.NomeFantazia = NomeFantazia;
	}
	public String getEndereço () {
		return Endereço;
	}
	public void setEndereço(String Endereço) {
		this.Endereço = Endereço;
	}
	public String getEmail () {
		return Email;
	}
	public void setEmail(String Email) {
		this.Email = Email;
	}
	public String getInscricaoEstadual() {
		return InscricaoEstadual;
	}
	public void setInscricaoEstadual(String InscricaoEstadual) {
		this.InscricaoEstadual = InscricaoEstadual;
		
	}
	public String getCancelarCadastro() {
		return CancelarCadastro;
	}
	public void setCancelarCadastro(String CancelarCadastro) {
		this.CancelarCadastro = CancelarCadastro;
	}
	public String getAtualizarDados() {
		return AtualizarDados;
	}
	public void setAtualizarDados(String AtualizarDados) {
		this.AtualizarDados = AtualizarDados;
	}}



