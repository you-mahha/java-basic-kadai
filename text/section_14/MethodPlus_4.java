package text.section_14;

public class MethodPlus_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int[] scoreArray = { 70, 85, 80, 95, 90, 120 }; // 点数
		
		// 点数ごとに成績をつける
		for( int score : scoreArray ) {
			System.out.println( score + "点だと成績は" + getGrade(score) );
		}
	}
		
		
		// 点数から成績を求めるメソッド
		public static char getGrade( final int score ) {
			char grade = 'C';
		
		
		// 点数が不正だった場合は成績を「-」としてメソッドを終了
		if( (score < 0) || (100 < score) ) {
			return '-';
		}
		
		
		// 点数によって成績を決める
		if( 90 <= score ) {
			grade = 'A';
		} else if ( 80 <= score ) {
			grade = 'B';
		}
		
		
		// 求めた成績を戻り値として返す
		return grade;

	}

}
