package jp.co.aforce.h.shimanaka.human;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//「日本人」クラス
public class Japanese implements Human {
	
	private String name;	 //名前データ
	private String birthday; //誕生日データ
	
	
	//String型の引数から名前を設定するデフォルトコンストラクタ
	public Japanese(String name){
		this.name = name;
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
			//その後カレンダークラスを使って日付を取得
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			Date Birth = sdf.parse(this.birthday);
			
			Calendar calendarBirth = Calendar.getInstance();
			calendarBirth.setTime(Birth);
			
			
			//現在日の日付を取得
			Calendar calendarNow = Calendar.getInstance();
			calendarNow.getTime();
	        
			
	        //(現在日の年度)-(誕生日の年度)で年齢を計算
	        int age = calendarNow.get(Calendar.YEAR) - calendarBirth.get(Calendar.YEAR);
	        
	        //(現在日の月数)<(誕生日の月数)なら年齢から1を引く
	        if (calendarNow.get(Calendar.MONTH) < calendarBirth.get(Calendar.MONTH)) {
	            age--;
	        
	        //(現在日の日数)<(誕生日の日数)なら年齢から1を引く
	        }else if (calendarNow.get(Calendar.MONTH) == calendarBirth.get(Calendar.MONTH)) {
	            
	            if (calendarNow.get(Calendar.DATE) < calendarBirth.get(Calendar.DATE)) {
	                age--;
	            }
	        }
	        
	        //取得した年齢を表示
	        System.out.println(age + "歳です。");
	        
		}catch(ParseException e) {
			e.printStackTrace(); //解析できなかった場合の例外処理
		}
		
	}

}
