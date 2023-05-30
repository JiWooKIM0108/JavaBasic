package Lesson9;

//車クラス

class Car6

{
	private int num;
	private double gas;
	
	public Car6()
	{
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました");
	}
	public Car6(int n, double g) 
	{
		this();
		num = n;
		gas = g;
		System.out.println("ナンバーを"+num+"にガソリン量"+gas+"にしました");
	}
	public void show()
	{
		System.out.println("車のナンバーは"+num+"です");
		System.out.println("ガソリン量は"+gas+"です.");
	}
}

public class Sample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car6 car1 = new Car6();
		car1.show();
		
		Car6 car2 = new Car6(1234, 20.5);
		
		car2.show();
	}

}
