package Metodo1;
import java.util.ArrayList;
import java.util.List;

public class ContasDAO {
	private List<Conta> conta;
	public ContasDAO () {
		conta = new ArrayList<Conta>();
		conta.add(new ContaComum(200.0));
		conta.add(new ContaComum(210.0));
		conta.add(new ContaComum(150.0));
		conta.add(new ContaComum(40.0));
		conta.add(new ContaComum(800.0));
		conta.add(new ContaComum(300.0));
		conta.add(new ContaEstudante(200.0));
		conta.add(new ContaEstudante(210.0));
		conta.add(new ContaEstudante(150.0));
		conta.add(new ContaEstudante(40.0));
		conta.add(new ContaEstudante(800.0));
		conta.add(new ContaEstudante(300.0));
	}
	public List<Conta> getConta() {
		return conta;
	}
	public void setConta(List<Conta> conta) {
		this.conta = conta;
	}
	
}
