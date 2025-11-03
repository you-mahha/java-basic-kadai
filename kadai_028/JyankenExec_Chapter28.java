package kadai_028;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {

		// じゃんけんクラスのインスタンスを作成
		Jyanken_Chapter28 Jyanken = new Jyanken_Chapter28();

		Jyanken.getMyHands();

		String myHands = Jyanken.getMyChoice(); // 戻り値を受け取る

		// 対戦相手のじゃんけんの手が乱数で選ばれる
		String cpuHands = Jyanken.getRandom();

		// じゃんけんの結果を表示する
		Jyanken.playGame(myHands, cpuHands);

	}

}
