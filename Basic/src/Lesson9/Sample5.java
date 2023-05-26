package Lesson9;

//車クラス

class Car5

{
	private int num;
	private double gas;
	
	public Car5()
	{
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました");
	}
	public Car5(int n, double g) 
	{
		num = n;
		gas = g;
		System.out.println("ナンバー"+num+"ガソリン量"+gas+"の車を作成しました");
	}
	public void show()
	{
		System.out.println("車のナンバーは"+num+"です");
		System.out.println("ガソリン量は"+gas+"です");
	}
}

public class Sample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car5 car1 = new Car5();
		
		car1.show();
		
		Car5 car2 = new Car5(1234, 20.5);
		
		car2.show();
	}

}
