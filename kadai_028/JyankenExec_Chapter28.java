package kadai_028;

import java.util.Scanner;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {

		// じゃんけんクラスのインスタンスを作成
		Jyanken_Chapter28 Jyanken = new Jyanken_Chapter28();

		Jyanken.getMyHands();

		// Scannerクラスのオブジェクトを生成
		Scanner scanner = new Scanner(System.in);

		// 入力した内容を取得する
		String input = scanner.next();

		String myHands = Jyanken.getMyChoice(input);

		// 対戦相手のじゃんけんの手が乱数で選ばれる
		String cpuHands = Jyanken.getRandom();

		// じゃんけんの結果を表示する
		Jyanken.playGame(myHands, cpuHands);

		// Scannerクラスのオブジェクトをクローズする
		scanner.close();

	}

}
