import java.util.ArrayList;
import java.util.List;

public class ContasDAO {
	private List<Conta> conta;
	public ContasDAO () {
		conta = new ArrayList<Conta>();
	}
	public List<Conta> getConta() {
		return conta;
	}
	public void setConta(List<Conta> conta) {
		this.conta = conta;
	}
	
}
