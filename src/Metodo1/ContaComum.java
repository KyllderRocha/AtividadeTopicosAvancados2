package Metodo1;

public class ContaComum extends Conta {
    public ContaComum() {
        super();
    }
    
    public ContaComum(double saldo) {
        super(saldo);
    }
    
    @Override
    public void rende() {
        this.saldo*= 1.1;
    }
}