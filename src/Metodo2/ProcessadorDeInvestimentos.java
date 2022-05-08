package Metodo2;

public class ProcessadorDeInvestimentos {
	public static void main(String[] args) {
		
		ContasDAO dao = new ContasDAO();
		
        for (Conta conta : dao.getConta()) {
        	if(conta instanceof ContaComum) {
        		ContaComum contaComum = (ContaComum)conta;
        		contaComum.rende();
        	}
            String tipo = conta instanceof ContaComum ? "Conta Comum" : "Conta Estudante";
            System.out.println("Novo Saldo: ("+ tipo +")");
            System.out.println(conta.getSaldo());
        }
    }
}
