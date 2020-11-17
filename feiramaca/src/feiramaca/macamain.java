package feiramaca;

import java.util.Scanner;

public class macamain {

	public static void main(String[] args) {
		int unidade;
		
		System.out.println("Digite quantas macas deseja adquirir \n");
		
		Scanner leia = new Scanner(System.in);
		
		unidade= leia.nextInt();
		
		if(unidade>=12) {
			double total = unidade * 0.25;
			System.out.println("o preco total eh \n"+total);
		}
		else {
			double total=0.3*unidade;
			System.out.println("preco total dos produtos eh \n"+total);
		}

	}

}
