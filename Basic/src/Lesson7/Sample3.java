package Lesson7;

import java.io.*;

public class Sample3 {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		System.out.println("いくつ*を出力しますか？");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		for(int i=1; i<=num; i++)
			System.out.println("*");
	}

}
