package java_kadai;

public class kadai3 {

	public static void main(String[] args) {
		
		double borrowing = 250000;
		int repayment = 30000;
		double interest_rate = 14.0;
		int i = 1;
		
		while(borrowing > 0) {
			
			borrowing += borrowing*interest_rate/1200;
			
			if(borrowing > repayment) {
				borrowing -= repayment;
				System.out.println(i+"ヶ月目:返済額="+repayment+"円,残り"+borrowing+"円");
				i++;
			}else if(borrowing <= repayment) {
				System.out.println(i+"ヶ月目:返済額="+borrowing+"円,返済完了。");
				borrowing = 0;
			}
			
		}
		
	}

}