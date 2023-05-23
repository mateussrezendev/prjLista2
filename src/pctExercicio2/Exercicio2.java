package pctExercicio2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		int n1, n2, n3, i;
		
		
		System.out.println("Montar tabuada de: ");
		n1 = entrada.nextInt();
		
		System.out.println("Começar por: ");
		n2 = entrada.nextInt();
		
		System.out.println("Terminar em: ");
		n3 = entrada.nextInt();
		
		System.out.println("Vou montar a tabuada de "+n1+" começando em "+n2+" e terminando em "+n3+":");
		
			for(i=n2; i<=n3;i++) {
				System.out.println(n1+" x "+i+" = "+n1*i);
			}
	entrada.close();
	}

}
