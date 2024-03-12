package Calculadora;

import java.util.Scanner;

public class CalculadoraUsandoWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int opcao;
		do {
		System.out.println("**************");
		System.out.println("***BEMVINDO***");
		System.out.println("***OPÇÕES: ***");
		System.out.println("***1 - SOMAR**");
		System.out.println("***2 - SUBTRAIR**");
		System.out.println("***3 - MULTIPLICAR**");
		System.out.println("***4 - DIVIDIR**");
		System.out.println("***5 - SAIR****");
		
		int n1;
		int n2;
		opcao = entrada.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("*VAMOS SOMAR!*");
				System.out.println("*DIGITE O PRIMEIRO NÚMERO: *");
					 n1= entrada.nextByte();
						System.out.println("*DIGITE O SEGUNDO NÚMERO: *");
							n2 = entrada.nextByte();
								int soma = n1+n2;
										System.out.printf("O RESULTADO É: %s", soma);
			break;
		case 2:
			System.out.println("*VAMOS SUBTRAIR!*");
				System.out.println("*DIGITE O PRIMEIRO NÚMERO: *");
					 n1= entrada.nextByte();
						System.out.println("*DIGITE O SEGUNDO NÚMERO: *");
							n2 = entrada.nextByte();
								int subtracao = n1-n2;
										System.out.printf("O RESULTADO É: %s", subtracao);
										break;
										
		case 3:
			System.out.println("*VAMOS MULTIPLICAR!*");
				System.out.println("*DIGITE O PRIMEIRO NÚMERO: *");
					 n1= entrada.nextByte();
						System.out.println("*DIGITE O SEGUNDO NÚMERO: *");
							n2 = entrada.nextByte();
								int multiplicar = n1*n2;
										System.out.printf("O RESULTADO É: %s", multiplicar);
										break;
		case 4:
			System.out.println("*VAMOS DIVIDIR!*");
				System.out.println("*DIGITE O PRIMEIRO NÚMERO: *");
					 n1= entrada.nextByte();
						System.out.println("*DIGITE O SEGUNDO NÚMERO: *");
							n2 = entrada.nextByte();
								int divisao = n1/n2;
										System.out.printf("O RESULTADO É: %s", divisao);
											break;
		case 5:
			System.out.println("*OBRIGADO!*");									

		default:System.out.println("NÚMERO INVÁLIDO");
			break;
		}
		}
		while(opcao !=5);
		
			
entrada.close();
	}
}