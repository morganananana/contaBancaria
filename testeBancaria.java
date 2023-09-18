package exercioAvaliativo2;

import java.util.Scanner;

public class testeBancaria {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		contaBancaria conta = new contaBancaria();
		System.out.println("qual seu saldo atual: ");
		conta.setSaldo(teclado.nextDouble());
		System.out.println("sacar(1), depositar(2) ou obter o saldo(3) ");
		int opcao = teclado.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("quanto voce quer sacar: ");
			conta.setQuantia(teclado.nextDouble());
			conta.sacar();
			break;
		case 2:
			System.out.println("quanto voce quer depositar: ");
			conta.setQuantia(teclado.nextDouble());
			conta.depositar();
			break;
		case 3:
			conta.obterSaldo();
			break;
		default:
			System.out.println("opcao invalida!");
			break;
		}
	}
}
