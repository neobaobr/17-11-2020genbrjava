package compawitch;

import java.util.Scanner;

public class switchmain {

	public static void main(String[] args) {
		int a=0,b=0,ent;
		Scanner leia = new Scanner(System.in);
		System.out.println("escolha a opcao desejada \n 1- digitar o valor de a \n 2-digitar o valor de b \n 3- comparar a e b");
		ent=leia.nextInt();
		switch(ent) {
		
		case 1: {
			System.out.println("digite o valor a \n");
			a=leia.nextInt();
			break;}
			
		case 2: {
			System.out.println("digite o valor b \n");
			b=leia.nextInt();
			break;}
			
		case 3 : {
			if(a>b && a!=b) {
				System.out.println("numero a maior que b \n" );
				}
				else {
					System.out.println("numero a maior que b \n" );
				}
				break;
			}
			
		
			default : System.out.println("opcao nao reconhecida \n");
		
		

	}

}}
