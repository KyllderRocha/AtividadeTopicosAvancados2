package Metodo1;

public class ProcessadorDeInvestimentos {
	public static void main(String[] args) {
		
		ContasDAO dao = new ContasDAO();
		
        for (Conta conta : dao.getConta()) {
            conta.rende();
            String tipo = conta instanceof ContaComum ? "Conta Comum" : "Conta Estudante";
            System.out.println("Novo Saldo: ("+ tipo +")");
            System.out.println(conta.getSaldo());
        }
    }
}
