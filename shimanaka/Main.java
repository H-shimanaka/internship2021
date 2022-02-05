package jp.co.aforce.h.shimanaka;

import jp.co.aforce.h.shimanaka.human.American;
import jp.co.aforce.h.shimanaka.human.Japanese;

public class Main {

	public static void main(String[] args) {
		
		//「日本人」クラスの実行
		Japanese taro = new Japanese("太郎");
		taro.setBirth("1990/1/13");
		taro.greeting();
		taro.getAge();
		
		//「アメリカ人」クラスの実行
		American john = new American("John");
		john.setBirth("1990/12/31");
		john.greeting();
		john.getAge();
		
	}

}
