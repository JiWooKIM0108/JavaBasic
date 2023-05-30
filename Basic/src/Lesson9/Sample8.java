package Lesson9;

//車クラス

class Car8

{
	public static int sum = 0;
	
	private int num;
	private double gas;
	
	public Car8()
	{
		num = 0;
		gas = 0.0;
		sum++;
		System.out.println("車を作成しました");
	}
	public void setCar(int n, double g) 
	{
		num = n;
		gas = g;
		System.out.println("ナンバーを"+num+"にガソリン量"+gas+"にしました");
	}
	public static void showSum() {
		System.out.println("車は全部で"+sum+"台あります");
	}
	public void show()
	{
		System.out.println("車のナンバーは"+num+"です");
		System.out.println("ガソリン量は"+gas+"です");
	}
}

public class Sample8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car8.showSum();
		
		Car8 car1 = new Car8();
		car1.setCar(1234, 20.5);
		
		Car8.showSum();
		
		Car8 car2 = new Car8();
		car1.setCar(4567, 30.5);
		
		Car8.showSum();
	}

}
