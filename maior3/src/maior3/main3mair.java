package maior3;

import java.util.Scanner;

public class main3mair {

	public static void main(String[] args) {
		int a,b,c;
		Scanner read = new Scanner(System.in);
		
		System.out.println("digite a \n ");
		a=read.nextInt();
		
		System.out.println("digite b \n ");
		b=read.nextInt();
		System.out.println("digite c \n ");
		c=read.nextInt();
		
		if(a>b && a>c) {System.out.println("o numero a eh o maior \n"+a);}
		
		
		if(b>a && b>c) {System.out.println("o numero b eh o maior \n"+b);}
			
			if(c>b && c>a) {System.out.println("o numero a eh o maior \n"+c);}
	}

}
