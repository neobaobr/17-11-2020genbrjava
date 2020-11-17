package poligonos;

import java.util.Scanner;

public class polimain {

	public static void main(String[] args) {
		int lados;
		double p;
		double medida,medida2,medida3,medida4,medida5;

		System.out.println("digite o numero de lados da figura\n");
		Scanner read = new Scanner(System.in);
		lados=read.nextInt();
		
		if(lados<3) {System.out.println("nao se trata de um triangulo ou poligono \n");}
		if(lados>5) {
			System.out.println("poligono nao identificado \n");
		}
		
		if(lados==3) {
			System.out.println("digite lado 1 \n");
			medida=read.nextInt();
			System.out.println("digite lado 2 \n");
			medida2=read.nextInt();
			System.out.println("digite lado 3 \n");
			medida3=read.nextInt();
			p=(medida+medida2+medida3)/2;
			System.out.println("voce formou um triangulo e sua area eh \n");
			double area= sqrt(p*(p-medida)*(p-medida2)*(p-medida3));
			System.out.println("sua area eh "+area);
		}
			if(lados==4) {
				System.out.println("digite lado  \n");
				medida=read.nextInt();
			System.out.println("voce formou um triangulo e sua area eh \n");
			double area= medida*medida;
			System.out.println("sua area eh "+area);}
			
			if(lados==5) {
			System.out.println("digite lado 1 \n");
			medida=read.nextInt();
			System.out.println("digite lado 2 \n");
			medida2=read.nextInt();
			System.out.println("digite lado 3 \n");
			medida3=read.nextInt();
			System.out.println("digite lado 4 \n");
			medida4=read.nextInt();
			System.out.println("digite lado 5 \n");
			medida5=read.nextInt();
		System.out.println("forma digitado eh um pentagono \n");	}
	}

	private static double sqrt(double d) {
		// TODO Auto-generated method stub
		return 0;
	}

}
