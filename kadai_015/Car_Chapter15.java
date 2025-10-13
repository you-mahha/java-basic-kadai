package kadai_015;

public class Car_Chapter15 {

// フィールド(内部データ)
	private String name = ""; // 商品名
	private int gear = 1;   // 変則ギア
	private int speed = 10; // 速度
	
	//コンストラクタ(初期化処理)
	public Car_Chapter15( String name, int gear, int speed ) {
		this.name = name;
		this.gear = gear;
		this.speed = speed;

	}
	
	// メソッド
	public void changeGear(int afterGear ) {
		System.out.println( "ギア" + this.gear + "から" + afterGear + "に切り替えました");
	    }

	public void run() {
		
		if( ( this.gear < 1) || (5 < this.gear) ) {
			speed = 10;
		}
		
		// 速度を
		System.out.println( "速度は時速" + (this.gear + 2) * this.speed + "kmです" ); 
			
		}
}