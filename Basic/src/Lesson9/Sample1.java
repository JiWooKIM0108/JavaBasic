package Lesson9;

//車クラス

class Car1
{
	int num;
	double gas;
	
	void show()
	{
		System.out.println("車のナンバーは"+num+"です");
		System.out.println("ガソリン量"+gas+"です");
	}
}

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 car1 = new Car1();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		car1.show();
	}

}
