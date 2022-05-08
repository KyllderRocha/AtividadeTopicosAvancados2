package Metodo3;

public abstract class Conta {
	protected double saldo;

    public Conta() {
        this.saldo = 0;
    }
    
    public Conta(double saldo) {
        this.saldo = saldo;
    }
    
    public void deposita(double valor) throws Exception {
        if(valor <= 0)
            throw new Exception("N�o pegou");    
        this.saldo += valor;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
}
