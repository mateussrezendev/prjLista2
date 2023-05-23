package pctExercicio3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao=0, qtde=0;
		
	       Scanner entrada = new Scanner(System.in);

	       

	       System.out.println("Especificação   Código   Preço");

	       System.out.println("Cachorro Quente   100   R$1,20");

	       System.out.println("Bauru Simples     101   R$1,30");

	       System.out.println("Bauru com ovo     102   R$1,50");

	       System.out.println("Hambúrguer        103   R$1,20");

	       System.out.println("Cheeseburguer     104   R$25,00");
	       
	       System.out.println("Refrigerante      105   R$1,00");

	       System.out.println("");
	       
	       System.out.println("Digite o código");

	       opcao = entrada.nextInt();

	       System.out.println("Digite a quantidade: ");

	       qtde = entrada.nextInt();

	       switch(opcao) {

	           case 100:

	               System.out.println("Total a pagar = R$"+(1.2*qtde));

	               break;

	           case 101:

	               System.out.println("Total a pagar = R$"+(1.3*qtde));

	               break;

	           case 102:

	               System.out.println("Total a pagar = R$"+(1.5*qtde));

	               break;

	           case 103:

	               System.out.println("Total a pagar = R$"+(1.2*qtde));

	               break;

	           case 104:

	               System.out.println("Total a pagar = R$"+(25*qtde));

	               break;

	           case 105:

	               System.out.println("Total a pagar = R$"+(1*qtde));

	               break;

	       

	       }
	       entrada.close();
	       
	}

}
