package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// KatoTaro_Chapter18クラスのオブジェクトを作る
		KatoTaro_Chapter18 Taro = new KatoTaro_Chapter18();
		
		// KatoIchiro_Chapter18クラスのオブジェクトを作る
		KatoIchiro_Chapter18 Ichiro = new KatoIchiro_Chapter18();
		
		// KatoHanako_Chapter18クラスのオブジェクトを作る
		KatoHanako_Chapter18 Hanako = new KatoHanako_Chapter18();

		
		// セッターを実行
		Taro.setGivenName("太郎");
		String givenName =Taro.getGivenName();
		System.out.println("名前は加藤" + givenName + "です");
		
		Taro.output();
		
		Ichiro.output();
		
		Hanako.output();
		
		
		Taro.eachIntroduce();
		System.out.println();
		
		Ichiro.eachIntroduce();
		
		Hanako.eachIntroduce();
	}
