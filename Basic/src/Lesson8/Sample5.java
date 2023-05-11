package Lesson8;

//車クラス
class Car5
{
	int num;
	double gas;
	
	void setNum(int n, Double g) {
		num = n;
		gas = g;
		System.out.println("車のナンバーを"+num+"にガソリン量を"+gas+"にしました");
	}
	
	void show() {
		System.out.println("車のナンバーは"+num+"です");
		System.out.println("ガソリン量は"+gas+"です");
	}
	
}


public class Sample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car5 car1 = new Car5();
		
		int number = 1234;
		Double gasoline = 20.5;
		
		car1.setNum(number, gasoline);
	}

}
