package Lesson3;

import java.io.*;
public class Sample5 {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		System.out.println("整数を入力してください");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num =  Integer.parseInt(str);
		System.out.println(num + "が入力されました");
	}

}
