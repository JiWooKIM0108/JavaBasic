package Lesson11;

//車クラス

class Car{
	protected int num;
	protected double gas;
	
	public Car() 
	{
		num = 0;
		gas = 0;
		System.out.println("車を作成しました");
	}
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("ナンバーを"+num+"ガソリン量を"+gas+"にしました");
	}
	
	public void show() {
		System.out.println("車のナンバーは"+num+"です");
		System.out.println("ガソリン量を"+gas+"です");
	}
}
//レーシングカークラス
class RacingCar extends Car{
	private int course;
	
	public RacingCar() 
	{
		course = 0;
		System.out.println("レーシングカーを作成しました");
	}
	public void setCourse(int c) {
		course = c;
		System.out.println("コース番号を"+course+"にしました");
	}
	public void newShow() {
		System.out.println("レーシングカーのナンバーは"+num+"です");
		System.out.println("ガソリン量は"+gas+"です");
		System.out.println("コース番号は"+course+"です");
	}
}
public class Smaple4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RacingCar rccar1;
		rccar1 = new RacingCar();
		
		rccar1.setCar(1234,20.5);
		rccar1.setCourse(5);
		
		rccar1.newShow();
	}

}
