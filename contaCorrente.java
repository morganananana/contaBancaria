package exercioAvaliativo2;

public class contaCorrente extends contaBancaria {

	public double depositar() {
		double depositar = getSaldo() + getQuantia();
		System.out.println("Saldo anterior: " + getSaldo());
		System.out.println("Valor depositado: " + getQuantia());
		System.out.println("Saldo atual: " + depositar);
		return depositar;
	}

	public double sacar() {
		double sacar = getSaldo() - (getQuantia() + (getQuantia() * 0.01));
		System.out.println("Saldo anterior: " + getSaldo());
		System.out.println("Valor sacado: " + getQuantia());
		System.out.println("Saldo atual: " + sacar);
		return sacar;

	}

	public void obterSaldo() {
		System.out.println("Saldo: " + getSaldo());
	}
}
