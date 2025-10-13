package kadai_015;

public class Car_Chapter15 {

// フィールド(内部データ)
	private int gear = 1;   // 変則ギア
	private int speed = 10; // 速度
	

	
	// メソッド
	public void changeGear(int afterGear) {
		gear = afterGear;
		if( ( gear < 1) || (5 < gear) ) {
			speed = 10;
		}
		speed = afterGear * 10;
		System.out.println( "ギア" + gear + "から" + (gear + 2 ) + "に切り替えました");
	    }
	public void run() {
			// 速度を
		System.out.println( "速度は時速" + speed + "kmです" ); 
			
		}
}