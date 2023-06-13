package Lesson11;

//車クラス

class Car7 {
	protected int num;
	protected double gas;
	
	public Car7() {
		num = 0;
		gas = 0;
		System.out.println("車を作成しました");
	}
	public void setCar7(int n, double g) {
		num = n;
		gas = g;
		System.out.println("ナンバーを"+num+"ガソリン量を"+gas+"にしました");
	}
	public String toString() {
		String str = "ナンバー："+num+"ガソリン量："+gas;
		return str;
	}
	
}
public class Sample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car7 car1 = new Car7();
		car1.setCar7(1234, 20.5);
		
		System.out.println(car1);
	}

}
