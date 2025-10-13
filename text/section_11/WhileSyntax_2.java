package text.section_11;

public class WhileSyntax_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int dice = 1; // サイコロの目
		int cnt = 0; // 繰り返し回数
		
		// 6が出るまでサイコロを振り続ける
		while( dice != 6 ) {
			
			// 繰り返し回数が5回以上になったら強制終了
			if( 5 <= cnt ) {
				System.out.println("5回に達したため強制終了します");
				break;
				
			}
			
			// サイコロを振る(1～6の目をランダムで生成)
			dice = (int)( Math.ceil( Math.random() * 6 ) );
			System.out.println("サイコロの目は" + dice);
			
			// 1回サイコロを振ったので、繰り返し回数を1プラス
			cnt++;
		}

	}

}
