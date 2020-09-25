
public class Main {

	public static void main(String[] args) {
		/*
		BancoClass andrey = new BancoClass("Andrey", 100.00);
		andrey.getSaldo();
		andrey.fazerDeposito(60);
		andrey.getSaldo();
		andrey.fazerRetirada(10);
		andrey.getSaldo();
		*/
		
		BancoGold ana = new BancoGold("Ana", 100.00);
		ana.getSaldo();
		ana.fazerDeposito(50);
		ana.getSaldo();
		ana.fazerRetirada(10);
		ana.getSaldo();
	}

}
