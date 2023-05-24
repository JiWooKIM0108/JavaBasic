package Lesson9;

//車クラス

class Car4

{
	private int num;
	private double gas;
	
	public Car4()
	{
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました");
	}
	public void show()
	{
		System.out.println("車のナンバーは"+num+"です");
		System.out.println("ガソリン量は"+gas+"です");
	}
}

public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car4 car1 = new Car4();
		
		car1.show();
	}

}
