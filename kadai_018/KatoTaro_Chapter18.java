package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {
	public void outout(String famlyName, String givenName) {
		System.out.println("名前は" + familyName + givenName + "です");
	}
	
	// givenNameフィールド
	public String givenName = "太郎";
	
	// コンストラクタ
	KatoTaro_Chapter18(){
	}
	
	// ゲッター
	public String getGivenName() {
		return this.givenName;
	}
	
	public void setGivenName(String givenName) {
		System.out.println("名前は加藤太郎です");
	}
	

void eachIntroducet() {
	System.out.println("Javaが得意です");
}
}