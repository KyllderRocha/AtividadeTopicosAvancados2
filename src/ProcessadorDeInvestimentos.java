
public class ProcessadorDeInvestimentos {
	public static void main(String[] args) {
		
		ContasDAO dao = new ContasDAO();
		
        for (Conta conta : dao.getConta()) {
            //conta.rende();
            System.out.println("Novo Saldo:");
            System.out.println(conta.getSaldo());
        }
    }
}
