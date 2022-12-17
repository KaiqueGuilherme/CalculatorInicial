package Calculator;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		double n1, n2 ;
		int op;
		double soma, subtracao, multiplicacao, divisao;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		n1 = entrada.nextDouble();
		System.out.println("Digite um número:");
		n2 = entrada.nextDouble();
		
		System.out.println("######SELECIONE UMA OPERAÇÃO######");
		System.out.println("[1] - SOMA");
		System.out.println("[2] - SUBTRAÇÃO");
		System.out.println("[3] - MULTIPLICAR");
		System.out.println("[4] - DIVIDIR");
		System.out.println(">>>>DIGITE SUA OPERAÇÃO<<<<");
		op = entrada.nextInt();
		
		switch(op){
		case 1: 
			soma = n1 + n2;
			System.out.println("A soma é:" + soma);
			break;
		case 2: 
			subtracao = n1 - n2;
			System.out.println("A soma é:"+subtracao);
			break;
		case 3: 
			multiplicacao = n1 * n2;
			System.out.println("A soma é:" +multiplicacao);
			break;
		case 4: 
			if(n1<n2) {
				System.out.println("Foi impossivel realizar este calculo!");
			}else {			
			divisao = n1 / n2;
			System.out.println("A soma é:" + divisao);}

			break;
		
				default:
					System.out.println("Opereação Invalida!");
		}
		
		
	}
	
	
}
