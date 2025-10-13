package text.section_12;

public class Array_PrimeNumbers {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 配列を作成(論理型のboolean型を使用)
		boolean[] primeNumber = new boolean[101];
		
		// 配列の初期化(true文で初期化)
		for (int i = 0; i < primeNumber.length; i++ ) {
			primeNumber[i] = true;
		}
		
		// 素数判定
		int devide = 2;
		while (devide < primeNumber.length) {
			for (int i = devide + 1; i < primeNumber.length; i++) {
				if (i % devide == 0) {
					primeNumber[i] = false;
				}
			}
			devide++;
		}
		
		// 素数の出力
		for (int i = 2; i < primeNumber.length; i++) {
			if (primeNumber[i]) {
				System.out.println(i);
			}
		}
		

	}

}
