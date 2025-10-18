package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {
	public void outout(String famlyName, String givenName) {
		System.out.println("名前は" + familyName + givenName + "です");
	}
	
	// givenNameフィールド
		public String givenName = "一郎";
		
		// コンストラクタ
		KatoIchiro_Chapter18(){
		}
		
		// ゲッター
		public String getGivenName() {
			return this.givenName;
		}
		
		public void setGivenName(String givenName) {
			System.out.println("名前は加藤一郎です");
		}
		

	void eachIntroducet() {
		System.out.println("好きな食べ物はリンゴです");
	}
	}
	