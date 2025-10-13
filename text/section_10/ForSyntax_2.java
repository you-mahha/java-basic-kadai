package text.section_10;

public class ForSyntax_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 変数i=1～10の範囲で繰り返す
		for( int i = 1; 1< 11; i ++ ) {
			System.out.println(i);
			// ループカウンタが5の時に繰り返し処理を強制終了
			if( i == 5 ) {
				System.out.println("繰り返し処理を強制終了します");
				break;
			}
		}

	}

}
