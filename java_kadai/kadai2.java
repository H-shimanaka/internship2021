package java_kadai;

import java.util.InputMismatchException;
import java.util.Scanner;

public class kadai2 {

	public static void main(String[] args) {
		float weight;
		System.out.println("体重の値をkgで入力してください");
		
		while(true) {
			try {
				Scanner sc2 = new Scanner(System.in);
				weight = sc2.nextFloat();
				break;
			}catch(InputMismatchException e) {
				System.out.println("体重は数値で入力してください");
			}
		}
		
		float height;
		System.out.println("身長の値をcmで入力してください");
		
		while(true) {
			try {
				Scanner sc1 = new Scanner(System.in);
				height = sc1.nextFloat();
				if(height == 0) {
					throw new ArithmeticException();
				}
				break;
			}catch(InputMismatchException e) {
				System.out.println("身長は数値で入力してください");
			}catch(ArithmeticException e) {
				System.out.println("0除算はできません");
			}
		}
		
		float bmi = weight/(height*height/10000);
		System.out.println("BMIは"+bmi);
		
		if(bmi >= 18.5 & bmi < 25) {
			System.out.println("あなたは標準です。");
		}else if(bmi >= 25 & bmi < 30) {
			System.out.println("あなたは肥満です。");
		}else if(bmi < 18.5) {
			System.out.println("あなたはやせです。");
		}else if(bmi >= 30){
			System.out.println("あなたは高度肥満です。");
		}

	}

}
