package Lesson10;

class Car3 {
	private int num;
	private Double gas;
	
	public Car3() {
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました");
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
public class Smaple9 {
	public static void main(String[] args) 
	{
		Car3[] cars;
		cars = new Car3[3];
		
		for(int i=0; i<cars.length; i++) {
			cars[i] = new Car3();
		}
		
		cars[0].setCar(1234, 20.5);
		cars[1].setCar(2345, 30.5);
		cars[2].setCar(3456, 40.5);
		
		for(int i=0; i<cars.length; i++) {
			cars[i].show();
		}
	}
}