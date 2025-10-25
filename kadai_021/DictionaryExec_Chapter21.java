package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// Dictionary_Chapter21 のオブジェクトを作成
	Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
	
	//辞書にあるか調べたい単語に配列を用意
			String[] words = {"apple", "banana", "grape", "orange"};
			
			// 配列の単語が辞書にあるか繰り返し判定
			for (String word : words) {
				
				// 辞書で意味を検索、出力
				String meaning = dictionary.getMeaning(word);
				
				// meaningがnull以外か判定
				if (meaning != null) { // meaningがnull(値がない)ではない場合
					System.out.println(word + "の意味は" + meaning);
				} else {
					System.out.println(word + "は辞書に存在しません");
			}
			}
	}
}