package Lesson7;

public class Sample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {80, 60, 22, 50, 75};
		
		for(int i=0; i<5; i++) {
			System.out.println((i+1) + "番目の人の点数は"+
					test[i] + "です");
		}
		System.out.println("テストの受験者は"+ test.length + 
				"人です");
	}

}
