package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	private HashMap<String, String> dictionary;
		
	public Dictionary_Chapter21() {
		// コンストラクタ(辞書の初期化)
		 dictionary = new HashMap<>();

		// 辞書に単語を登録
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウィ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");
	}
	
	// get meaning()で単語の意味を取得
	public String getMeaning(String word) {
        return dictionary.get(word);
    }
		
}		