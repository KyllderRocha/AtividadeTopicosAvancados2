public class ContaComum extends Conta {
    protected double saldo;

    public ContaComum() {
        this.saldo = 0;
    }
    public void deposita(double valor) throws Exception {
        if(valor <= 0)
            throw new Exception("ValorInvalidoException");    
        this.saldo += valor;
    }
    public double getSaldo() {
        return saldo;
    }
    public void rende() {
        this.saldo*= 1.1;
    }
}