package kadai_015;

public class Car_Chapter15 {

// フィールド(内部データ)
	private int gear = 1;   // 変則ギア
	private int speed = 10; // 速度
	

	
	// メソッド
	public void changeGear(int afterGear) {
		gear = afterGear - 2;
		if( ( afterGear < 1) || (5 < afterGear) ) {
			speed = 10; 
		} else { speed = afterGear * 10;
		}
		System.out.println( "ギア" + gear + "から" + afterGear + "に切り替えました");
	    }
	public void run() {
			// 速度を
		System.out.println( "速度は時速" + speed + "kmです" ); 
			
		}
}