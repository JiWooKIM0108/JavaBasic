package Lesson11;
class Car8 {
	protected int num;
	protected double gas;
	
	public Car8() {
		num = 0;
		gas = 0;
		System.out.println("車を作成しました");
	}
}
public class Sample8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car9 car1 = new Car9();
		Car9 car2 = new Car9();
		
		Car9 car3;
		car3 = car1;
		
		boolean bl1 = car1.equals(car2);
		boolean bl2 = car1.equals(car3);
		
		System.out.println("car1とcar2が同じか調べました"+bl1+"でした");
		System.out.println("car1とcar3が同じか調べました"+bl2+"でした");
	}

}
