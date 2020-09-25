
public class BancoGold extends BancoClass {

	public BancoGold(String nome, double saldo) {
		super(nome, saldo);
	}
	
	public void fazerRetirada (double retirada) {
		saldo -= retirada + (retirada * 0.1);
	}

}
