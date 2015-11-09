/*classe abstrata*/
public abstract class Produto {
	private String nome;
	private long preco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getPreco() {
		return preco;
	}
	public void setPreco(long preco) {
		this.preco = preco;
	}
	
//	m�todo abstrato
	public abstract String getCodigoBarras();
	
//	sobrescrita do m�todo toString (Object)
	public String toString() {
		return " Nome :" +getNome() +
				" Preco: " + getPreco();
	}
	
}
