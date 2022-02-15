package jp.co.aforce.h.shimanaka.human;

//「人間」の抽象クラス
public abstract class Human_abstract {
	public String name;	 //名前データ
	public String birthday; //誕生日データ
	
	//String型の引数から名前を設定するメソッド
	public Human_abstract(String name) {
		this.name = name;
	}
	
	//誕生日をString型で"yyyy/MM/dd"の形式で取得するセッタ
	public void setBirth(String birthday) {
		this.birthday = birthday;
	}
	
	

}
