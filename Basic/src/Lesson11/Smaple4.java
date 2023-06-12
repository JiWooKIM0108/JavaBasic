package Lesson11;

//車クラス

class Car4{
	protected int num;
	protected double gas;
	
	public Car4() 
	{
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました");
	}
	public void setCar4(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("ナンバーを"+num+"ガソリン量を"+gas+"にしました");
	}
	
	public void show() 
	{
		System.out.println("車のナンバーは"+num+"です");
		System.out.println("ガソリン量を"+gas+"です");
	}
}
//レーシングカークラス
class RacingCar4 extends Car4
{
	private int course;
	
	public RacingCar4() 
	{
		course = 0;
		System.out.println("レーシングカーを作成しました");
	}
	public void setCourse(int c) 
	{
		course = c;
		System.out.println("コース番号を"+course+"にしました");
	}
	public void Show() 
	{
		System.out.println("レーシングカーのナンバーは"+num+"です");
		System.out.println("ガソリン量は"+gas+"です");
		System.out.println("コース番号は"+course+"です");
	}
}
public class Smaple4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RacingCar4 rccar1;
		rccar1 = new RacingCar4();
		
		rccar1.setCar4(1234,20.5);
		rccar1.setCourse(5);
		
		rccar1.Show();
	}

}
