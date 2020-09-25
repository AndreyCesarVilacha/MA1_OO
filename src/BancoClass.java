
public class BancoClass {
	protected String nome;
	protected double saldo;
	
	public BancoClass(String nome, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public void getSaldo() {
		System.out.println( nome + " seu saldo: " + saldo);
	}
	
	public void fazerDeposito (double deposito) {
		saldo += deposito;
	}
	
	public void fazerRetirada (double retirada) {
		saldo -= retirada + (retirada * 0.5);
	}

}
