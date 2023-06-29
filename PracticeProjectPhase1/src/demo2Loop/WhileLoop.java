package demo2Loop;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int PINinBankDB = 1234;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your pin - ");
		int PINenteredByUser = scanner.nextInt();
		
		while(PINenteredByUser != PINinBankDB) {
			System.out.println("incorrect atm pin, please try again");
			PINenteredByUser = scanner.nextInt();
		}
		
		System.out.println("welcome to ABC Bank");

	}

}
