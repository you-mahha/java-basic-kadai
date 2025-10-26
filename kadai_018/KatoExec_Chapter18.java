package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// KatoTaro_Chapter18クラスのオブジェクトを作る
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();

		// KatoIchiro_Chapter18クラスのオブジェクトを作る
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		//		
		//		// KatoHanako_Chapter18クラスのオブジェクトを作る
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();

		// セッターを実行
		taro.setGivenName();
		ichiro.setGivenName();
		hanako.setGivenName();

		// execIntroduce()を実行する
		taro.execIntroduce();
		ichiro.execIntroduce();
		hanako.execIntroduce();
	}

}
