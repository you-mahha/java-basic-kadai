package kadai_018;

abstract public class Kato_Chapter18 {
		
		// フィールドを作成
		public final String familyName = "加藤";
		public String givenName = "";
		public final String address = "住所は東京都中野区〇×です";
		
		// 共通の紹介を出力する
		public void commonIntroduce();
		void output() {
		}
		
		// 個別の紹介を出力する
		abstract public void eachIntroduce();
		
		// 紹介を実行する
		public void execIntroduce();

	}
