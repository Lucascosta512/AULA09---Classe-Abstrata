
public class Dvd extends Produto{
	
	private long tempoDuracao;
	private long precoNovo;
	
	
	public long getTempoDuracao() {
		return tempoDuracao;
	}
	
	public void setTempoDuracao(long tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}
	
//	sobrescrita do m�todo toString (Produto)
	public String toString() {
		return super.toString() +
				" Tempo Dura��o : " + getTempoDuracao();
	}
//	implementa��o do m�todo getCodigoBarras
	public String getCodigoBarras() {
		return getNome()+getTempoDuracao();

	}
}
