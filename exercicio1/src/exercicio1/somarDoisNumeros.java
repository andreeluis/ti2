package exercicio1;

import java.util.*;

class somarDoisNumeros {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num1, num2, soma;
		
		System.out.print("Digite um número: ");
		num1 = sc.nextInt();
		
		System.out.print("Digite outro número: ");
		num2 = sc.nextInt();
		
		soma = num1 + num2;
		
		System.out.println("A soma é: " + soma);
	}

}
