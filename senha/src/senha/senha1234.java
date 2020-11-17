package senha;

import java.util.Scanner;

public class senha1234 {

	public static void main(String[] args) {
		int senha,i=0;
		
		System.out.println("digite a senha de 4 digitos \n");
		Scanner read = new Scanner(System.in);
		senha=read.nextInt();
		while(senha!=1234) {
			System.out.println("senha invalida - acesso negado , tente novamente \n");
			System.out.println("digite a senha de 4 digitos, tentativas : \n"+(i+1));
			senha=read.nextInt();
			i++;
		

	}
		System.out.println("senha aceita- acesso concedido , seja bem vindo \n");
		System.out.println("finaliza \n");
}}
