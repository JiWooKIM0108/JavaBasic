package Lesson10;


class Car2 {
	private int num;
	private Double gas;
	private String name;
	
	public Car2() {
		num = 0;
		gas = 0.0;
		name = "名無し";
		System.out.println("車を作成しました");
	}
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		
		System.out.println("ナンバーを"+num+"にガソリン量を"+gas+"にしました");
	}public void setname(String nm) {
		name = nm;
		System.out.println("名無し"+name+"にしました");
	}
	public void show() {
		System.out.println("車のナンバーは"+num+"です");
		System.out.println("ガソリン量を"+gas+"です");
		System.out.println("名前は"+name+"です");
	}
}



public class Sample8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 car1;
		car1 = new Car2();
		
		car1.show();
		
		int number = 1234;
		double gasoline = 20.5;
		String str = "1号車";
		
		car1.setCar(number, gasoline);
		car1.setname(str);
		
		car1.show();
	}

}
