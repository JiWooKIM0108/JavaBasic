	package Lesson9;

//車クラス

class Car2
{
	private int num;
	private double gas;
	
	public void setNumGas(int n, double g) {
		if(g > 0 && g < 1000) {
			num = n;
			gas = g;
			System.out.println("ナンバーを"+num+"ガソリン量は"+gas+"にしました");
		}
		else {
			System.out.println(g+"は正しいガソリン量ではありません");
			System.out.println("ガソリン量を変更できませんでした");
		}
	}
	
	public void show()
	{
		System.out.println("車のナンバーは"+num+"です");
		System.out.println("ガソリン量"+gas+"です");
	}
}

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 car1 = new Car2();
		
		//このようなアクセスはできなくなります
		//car1.num = 1234;
		//car1.gas - -10.0;
		
		car1.setNumGas(1234, 20.5);
		car1.show();
		
		System.out.println("正しくないガソリン量(-10.0)を指定してみます");
		
		car1.setNumGas(1234, -10.0);
		car1.show();
		
		car1.show();
	}

}
