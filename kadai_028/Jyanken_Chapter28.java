package kadai_028;

import java.util.HashMap;

public class Jyanken_Chapter28 {
	private HashMap<String, String> hands = new HashMap<String, String>();

	// コンストラクタを追加してhandsに要素を初期化
	public Jyanken_Chapter28() {
		this.hands.put("r", "グー");
		this.hands.put("s", "チョキ");
		this.hands.put("p", "パー");
	}

	// じゃんけんクラスを作成
	public String getMyChoice(final String inputHand) {
		String type = "r";

		if (inputHand.equals("r") || inputHand.equals("s") || inputHand.equals("p")) {
			return inputHand; // ユーザーが入力した文字列をそのまま返す
		} else {
			System.out.println("無効な入力です。r, s, p のいずれかを入力してください。");
			return "r"; // 例として無効な場合は r (グー) を返すなどの処理が必要
		}
	}

	// 対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		String[] hands = { "r", "s", "p" };

		int random = (int) (Math.floor(Math.random() * 3));

		String cpuHands = hands[random];

		return cpuHands;
	}

	public void getMyHands() {

		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
	}

	public void playGame(String myHands, String cpuHands) {
		System.out.println("自分の手は" + hands.get(myHands) + "," + "対戦相手の手は" + hands.get(cpuHands));

		// equals()メソッドで比較する
		if (myHands.equals(cpuHands)) {
			System.out.println("あいこです");
		} else if ((myHands.equals("r") && cpuHands.equals("s")) || (myHands.equals("s") && cpuHands.equals("p"))
				|| (myHands.equals("p") && cpuHands.equals("r"))) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
	}
}
