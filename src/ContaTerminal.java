import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Digite a Conta Bancária:");
		System.out.print("Digite o Número:");
		int num = sc.nextInt();
		System.out.print("Digite a Agência:");
		String agency = sc.next();
		sc.nextLine();
		System.out.print("Digite o Nome do Cliente:");
		String name = sc.nextLine();
		System.out.print("Digite o Saldo:");
		Double balance = sc.nextDouble();
		System.out.print("Olá " + name + ", obrigado por criar uma conta em nosso banco," + " sua agência é " + agency
				+ ", conta " + num + ", e seu saldo " + balance + " já está disponível para saque.");

		sc.close();
	}

}
