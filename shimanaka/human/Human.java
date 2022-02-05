package jp.co.aforce.h.shimanaka.human;

//「人間」のインターフェイス
public interface Human {
	
	//誕生日をString型で"yyyy/MM/dd"の形式で取得するセッタ
	public void setBirth(String birthday);
	
	//「挨拶」のメソッド
	public void greeting();
	
	//誕生日と現在日から年齢を割り出すメソッド
	public void getAge();

}
