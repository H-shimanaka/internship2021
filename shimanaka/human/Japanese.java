package jp.co.aforce.h.shimanaka.human;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//「日本人」クラス
public class Japanese extends Human_abstract implements Human_interface {
	
	//String型の引数から名前を設定するデフォルトコンストラクタ
	public Japanese(String name){
		super(name);
	}
	
	
	//「日本人」の挨拶メソッド
	@Override
	public void greeting() {
		System.out.println("こんにちは！");
		System.out.println("私の名前は"+ name + "です。");
	}
	
	
	//誕生日をString型で"yyyy/MM/dd"の形式で取得するセッタ
	@Override
	public void setBirth(String birthday) {
		this.birthday = birthday;
	}
	
	
	//誕生日と現在日から年齢を割り出すメソッド
	@Override
	public void getAge() {
		
		//誕生日を解析する際の例外処理
		try{
			//取得した誕生日をDate型に解析
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			Date Birth = sdf.parse(this.birthday);
			
			//現在の日時をミリ秒で取得
			//(現在日のミリ秒-誕生日のミリ秒) / 1年のミリ秒 で年齢を取得
			long now = System.currentTimeMillis();
			
			long age = (now - Birth.getTime())/86400000/365;
	        
	        //取得した年齢を表示
	        System.out.println(age + "歳です。");
	        
		}catch(ParseException e) {
			e.printStackTrace(); //解析できなかった場合の例外処理
		}
		
	}

}
