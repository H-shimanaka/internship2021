package java_kadai02;

//携帯電話クラス
public class Telephone {
	private String callNumber;  //電話番号データ変数
	private String mailAddress; //メールアドレスデータ変数
	
	//外部から電話番号を設定するメソッド
	public void setCallNum(String callNumber) {
		this.callNumber = callNumber;
	}
	
	//外部からメールアドレスを設定するメソッド
	public void setMail(String mailAddress) {
		this.mailAddress = mailAddress;
	}
	
	//電話をかけるメソッド
	public void calling() {
		System.out.println(this.callNumber + "から電話を掛けます");
	}
	
	//メールを送信するメソッド
	public void sendMail() {
		System.out.println(this.mailAddress + "からメールを送信します");
	}

}
