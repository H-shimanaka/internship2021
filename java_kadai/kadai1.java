package java_kadai;

import java.util.InputMismatchException;
import java.util.Scanner;

public class kadai1 {

	public static void main(String[] args) {
		
		int num1;
		System.out.println("1つ目の値を入力してください");
		
		while(true) {
			try {
				Scanner sc1 = new Scanner(System.in);
				num1 = sc1.nextInt();
				break;
			}catch(InputMismatchException e) {
				System.out.println("数値を入力してください");
			}
		}
		
		
		int num2;
		System.out.println("2つ目の値を入力してください");
		
		while(true) {
			try {
				Scanner sc2 = new Scanner(System.in);
				num2 = sc2.nextInt();
				break;
			}catch(InputMismatchException e) {
				System.out.println("数値を入力してください");
			}
		}
		
		
		int total = num1 + num2;
		int average = (num1 + num2)/2;
		System.out.println(total);
		System.out.println(average);

	}

}