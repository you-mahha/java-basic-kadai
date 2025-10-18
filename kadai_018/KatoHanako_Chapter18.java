package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {
	public void outout(String famlyName, String givenName) {
		System.out.println("名前は" + familyName + givenName + "です");
	}
	
	// givenNameフィールド
		public String givenName = "花子";
		
		// コンストラクタ
		KatoHanako_Chapter18(){
		}
		
		// ゲッター
		public String getGivenName() {
			return this.givenName;
		}
		
		public void setGivenName(String givenName) {
			System.out.println("名前は加藤花子です");
		}
		

	void eachIntroducet() {
		System.out.println("趣味は読書です");
	}
	}