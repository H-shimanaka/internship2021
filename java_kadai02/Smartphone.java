package java_kadai02;

//スマートフォンクラス
//携帯電話クラスの機能と変数を継承
public class Smartphone extends Telephone {
	
	public int volume = 5;  //音量変数
	public int trackNo = 1; //トラックNo変数
	
	//音楽を再生するメソッド
	public void playMusic() {
		System.out.println(trackNo + "曲目を再生します。");
	}
	
	//音楽を停止するメソッド
	public void stopMusic() {
		System.out.println("音楽を止めます。");
	}
	
	//次の曲へ送るメソッド
	public void nextMusic() {
		trackNo += 1;
		System.out.println(trackNo + "曲目を再生します。");
	}
	
	//前の曲へ送るメソッド
	public void prevMusic() {
		trackNo -= 1;
		System.out.println(trackNo + "曲目を再生します。");
	}
	
	//音量を上げるメソッド
	public void volumeUp(int i) {
		volume += i;
		System.out.println("volumeを" + i + "上げます。");
		
		//volumeの最大値を10にする
		if(volume >= 10) {
			volume = 10;
		}
			
		System.out.println("volumeは" + volume + "です。");
		
	}
	
	//音量を下げるメソッド
	public void volumeDown(int i) {
		volume -= i;
		System.out.println("volumeを" + i + "下げます。");
		
		//volumeの最小値を0にする
		if(volume <= 0) {
			volume = 0;
		}
		
		System.out.println("volumeは" + volume + "です。");
		
		
	}

}
