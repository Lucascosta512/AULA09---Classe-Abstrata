
public class Livro extends Produto{
	
	private String autor;
	
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
//	sobrescrita do m�todo toString (Produto)
	public String toString() {
		return super.toString() +
				" Autor: " + getAutor();
	}
	
//	implementa��o do m�todo getCodigoBarras
	public String getCodigoBarras() {
		return getNome()+getAutor();
	}
	
	
}
