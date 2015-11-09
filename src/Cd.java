
public class Cd extends Produto{
	
	private long numeroFaixas;
	
	
	public long getNumeroFaixas() {
		return numeroFaixas;
	}
	
	public void setNumeroFaixas(long numeroFaixas) {
		this.numeroFaixas = numeroFaixas;
	}
	
//	sobrescrita do m�todo toString (Produto)
	public String toString() {
		return super.toString() +
				" Numero de faixas: " + getNumeroFaixas();
	}

//	implementa��o do m�todo getCodigoBarras
	@Override
	public String getCodigoBarras() {
		return getNome()+getNumeroFaixas();
	}
	
}
