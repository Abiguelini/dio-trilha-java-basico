package contaBanco;

import java.util.Scanner;

public class contaBanco {

	public static void main(String[] args) {
		
		
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Por favor, digite o número da conta !\"");
		int agencia1= sc.nextInt();
		System.out.println("Por favor, digite da Agência !\"");
		String nome1= sc.next();
		System.out.println("Por favor, digite o nome do usuario !\"");
		String nomecliente= sc.next();
		System.out.println("Por favor, digite o saldo do usuario !\"");
		double saldo = sc.nextDouble();
		Usuario u1 = new Usuario(agencia1, nome1, nomecliente, saldo);
		
		System.out.println("Olá" + nomecliente + " obrigado por criar uma conta em nosso banco, sua agência é " + nome1+ ", conta " + agencia1+ " e seu saldo " + saldo+ " já está disponível para saque");
	}

}
