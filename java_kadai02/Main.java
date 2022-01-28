package java_kadai02;

public class Main {

	public static void main(String[] args) {
		
		//携帯電話クラスの実行
		Telephone tel = new Telephone();
		
		tel.setCallNum("090-0000-0000");
		tel.setMail("test@a-force.co.jp");
		
		tel.calling();
		tel.sendMail();
		
		
		//スマートフォンクラスの実行
		Smartphone smart = new Smartphone();
		
		smart.playMusic();
		
		smart.volumeUp(6);
		
		smart.nextMusic();
		
		smart.volumeDown(5);
		
		smart.stopMusic();
		
		smart.setCallNum("090-1111-1111");
		smart.setMail("sample@a-force.co.jp");
		
		smart.calling();
		smart.sendMail();

	}

}
