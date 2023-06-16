package Lesson12;

public class Smaple2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle[] vc;
		vc = new Vehicle[2];
		
		vc[0] = new Car(1234,20.5);
		vc[1] = new Plane(2);
		
		for(int i=0; i<vc.length; i++) {
			if(vc[i] instanceof Car)
				System.out.println((i+1)+"番目のオブジェクトはcarクラスです");
			else
				System.out.println((i+1)+"番目のオブジェクトはcarではありません");
		}
	}

}
