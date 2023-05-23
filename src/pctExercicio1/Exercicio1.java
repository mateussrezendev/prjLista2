package pctExercicio1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner (System.in);
		byte opcao = 1;
		int n1, n2, soma, sub, mult, div;
		
		System.out.println("Digite o primeiro número: ");
		n1 = leitura.nextInt();
		
		System.out.println("Digite o segundo número: ");
		n2 = leitura.nextInt();
		
		soma = n1+n2;
		sub = n1-n2;
		mult = n1*n2;
		div = n1/n2;
		

		
		while ((opcao != 0) && (opcao <= 4)) {
			System.out.println("******************");
			System.out.println("(0) Sair");
			System.out.println("(1) Somar");
			System.out.println("(2) Subtrair");
			System.out.println("(3) Multiplicar");
			System.out.println("(4) Dividir");
			System.out.print("(?) Opção: ");
			opcao = leitura.nextByte();
			System.out.println("******************");
			
			switch(opcao) {

	           case 0:

	               System.out.println("Sair");

	               break;

	           case 1:
	               System.out.println(n1+" + "+n2+" = "+soma);
	        	   
	        	   
	               break;

	           case 2:

	               System.out.println(n1+" - "+n2+" = "+sub);

	               break;   
	               
	           case 3:

	                   System.out.println(n1+" * "+n2+" = "+mult);

	                   break;

	           case 4:

	                   System.out.println(n1+" / "+n2+" = "+div);

	                   break; 

	           default:

	               System.out.println("Opcao Errada");

	               break;

	       

			}
		
		}
		
	}

}


