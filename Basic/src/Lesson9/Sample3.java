package Lesson9;

//車クラス

class Car3
{
	private int num;
	private double gas;
	
	public void setCar3(int n) {
		num = n;
		System.out.println("ナンバーを"+num+"にしました");
		}
	public void setCar3(Double g) {
		gas = g;
		System.out.println("ガソリン量を"+gas+"にしました");
		}
	public void setCar3(int n, Double g) {
		num = n;
		gas = g;
		System.out.println("ナンバーを"+num+"にガソリン量を"+gas+"にしました");
	}
	
	public void show()
	{
		System.out.println("車のナンバーは"+num+"です");
		System.out.println("ガソリン量は"+gas+"です");
	}
}

public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car3 car1 = new Car3();
	
		
		car1.setCar3(1234, 20.5);
		car1.show();
		
		System.out.println("車のナンバーだけ変更します");
		car1.setCar3(2345);
		car1.show();
		
		System.out.println("ガソリン量だけ変更します");
		car1.setCar3(30.5);
		car1.show();
	}

}
