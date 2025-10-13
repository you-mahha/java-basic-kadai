package text.section_05;

public class Variable_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		final double    PI = 3.14159;                // 円周率
		double circleArea = 0, circumference = 0; // 園の面積・円周
		int radius         = 5;                      // 円の半径
		
		// 園の面積を求める
		circleArea           = PI * radius * radius;
		System.out.println(circleArea);
		
		// 円周を求める
		circumference = PI * (radius * 2);
		System.out.println(circumference);

	}

}
