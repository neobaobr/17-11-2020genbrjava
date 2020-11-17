package maioremenor;

import java.util.Scanner;

public class mainmnr {

	public static void main(String[] args) {
		double num1, num2;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("digite o numero 1 de 2 :\n ");
		num1 = read.nextDouble();
		System.out.println("digite o numero 1 de 2 : \n");
		num2 = read.nextDouble();
		
		if(num1>num2 && num1!=num2) {
			System.out.println("numero 1 maior que numeros dois \n");
		}
		if(num1<num2 && num1!=num2 ){
		System.out.println("numero 2 maior que numero 1 \n");	
		
		}
		if(num1==num2)
		 {System.out.println("os dois numeros digitados sao iguais \n");}
	}

}
