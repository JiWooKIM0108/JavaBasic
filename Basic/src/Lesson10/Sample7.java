package Lesson10;

class Car1 {
	private int num;
	private Double gas;
	
	public Car1() {
		num = 0;
		gas = 0.0;
		System.out.println("carを作成しました");
	}
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		
		System.out.println("ナンバーを"+num+"にガソリン量を"+gas+"にしました");
	}
	public void show() {
		System.out.println("車のナンバーは"+num+"です");
		System.out.println("ガソリン量を"+gas+"です");
	}
}


public class Sample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 car1;
		System.out.println("car1を宣言しました");
		car1 = new Car1();
		car1.setCar(1234, 20.5);
		
		Car1 car2;
		System.out.println("car2を宣言しました");
		
		car2 = car1;
		System.out.println("car2にcar1を代入しました");
		
		System.out.println("car1がさす");
		car1.show();
		System.out.println("car2がさす");
		car2.show();
		
		System.out.println("car1がさす車に変更を加えます");
		car1.setCar(2345, 30.5);
		
		System.out.println("car1がさす");
		car1.show();
		System.out.println("car2がさす");
		car2.show();
		
	}

}