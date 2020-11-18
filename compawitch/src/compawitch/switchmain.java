package compawitch;

import java.util.Scanner;

public class switchmain {

	public static void main(String[] args) {
		int a = 0, b = 0, ent;
		boolean case3 = false;
		Scanner leia = new Scanner(System.in);
		System.out.println(
				"escolha a opcao desejada \n 1- digitar o valor de a \n 2-digitar o valor de b \n 3- comparar a e b");
		ent = leia.nextInt();
		while (ent != 4) {
			switch (ent) {

			case 1: {
				System.out.println("digite o valor a \n");
				a = leia.nextInt();
				case3 = true;
				break;
			}

			case 2: {
				System.out.println("digite o valor b \n");
				b = leia.nextInt();
				case3 = true;
				break;
			}

			case 3: {
				if (case3) {

					if (a > b) {
						System.out.println("numero A maior que B \n");
					}

					else {
						System.out.println("numero B maior que A \n");
					}
					break;
				}
			}
			case 4: {
				System.out.println("sair \n");
			}

			default:
				System.out.println("opcao nao reconhecida \n");

			}
		}

	}
}
