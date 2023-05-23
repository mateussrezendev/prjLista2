package pctExercicio4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, patos;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o número de patinhos que foram passear");
		n = entrada.nextInt();
		
		while (n-- != 1) {

		patos = n - 1;
		System.out.println(n+" patinhos foram passear");
		System.out.println("Além das montanhas");
		System.out.println("Para brincar");
		System.out.println("A mamãe gritou: Quá, quá, quá, quá Mas só "+patos+" patinhos voltaram de lá.");
		}
	entrada.close();	
	}

}
