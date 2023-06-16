package Lesson12;

//のりものインターフェース
interface iVehicle4{
	void vShow();
}
//材料インターフェース
interface iMaterial{
	void mShow();
}
//車クラス
class Car4 implements iVehicle4, iMaterial{
	private int num;
	private double gas;
	
	public Car4(int n, double g) {
		num = n;
		gas = g;
		System.out.println("ナンバー"+num+"ガソリン量"+gas+"の車を作成しました");
	}
	public void vShow() {
		System.out.println("車のナンバーは"+num+"です");
		System.out.println("ガソリン量"+gas+"です");
	}
	public void mShow() {
		System.out.println("車の材料は鉄です");
	}
}
public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car4 car1 = new Car4(1234, 20.5);
		car1.vShow();
		car1.mShow();
	}

}
