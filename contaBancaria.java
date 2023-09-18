package exercioAvaliativo2;

public class contaBancaria {
	private double quantia;
	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getQuantia() {
		return quantia;
	}

	public void setQuantia(double quantia) {
		this.quantia = quantia;
	}

	public double depositar() {
		double depositar = saldo + quantia;
		System.out.println("Saldo anterior: " + saldo);
		System.out.println("Valor depositado: " + quantia);
		System.out.println("Saldo atual: " + depositar);
		return depositar;
	}

	public double sacar() {
		double sacar = saldo - (quantia + (quantia * 0.05));
		System.out.println("Saldo anterior: " + saldo);
		System.out.println("Valor sacado: " + quantia);
		System.out.println("Saldo atual: " + sacar);
		return sacar;

	}

	public void obterSaldo() {
		System.out.println("Saldo: " + saldo);
	}

}
