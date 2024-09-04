package P.O.O;

public class Cadeira {

	 String Cor;
	 String Modelo;
	 String SobeDesce;
	 String Apoio;
	 int QuantPernas;
	 
	 public String getCor () {
			return Cor;
		}
		public void setCor(String Cor) {
			this.Cor = Cor;
		}
		public String getModelo () {
			return Modelo;
		}
		public void setModelo (String Modelo) {
			this.Modelo = Modelo;
		}
		public String getSobeDesce () {
			return SobeDesce;
		}
		public void setSobeDesce (String SobeDesce) {
			this.SobeDesce = SobeDesce;
		}
		public String getApoio () {
			return Apoio;
		}
		public void setApoio (String Apoio) {
			this.Apoio = Apoio;
		}
		public int getQuantPernas () {
			return QuantPernas;
		}
		public void setQuantPernas(int QuantPernas) {
			this.QuantPernas = QuantPernas;
		}
}
