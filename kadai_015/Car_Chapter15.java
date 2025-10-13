package kadai_015;

public class Car_Chapter15 {

// フィールド(内部データ)
	private int gear = 1;   // 変則ギア
	private int speed = 10; // 速度
	

	
	// メソッド
	public void changeGear(int afterGear) {
		int gear = this.gear; // 初期値のギアを保存
		this.gear = afterGear; //ギアを変更
		if( ( afterGear > 1 && afterGear < 5 ) ) {
			speed = afterGear * 10; 
		} else { speed = 10;
		}
		System.out.println( "ギア" + gear + "から" + ( afterGear ) + "に切り替えました");
	    }
	public void run() {
			// 速度を
		System.out.println( "速度は時速" + speed + "kmです" ); 
			
		}
}