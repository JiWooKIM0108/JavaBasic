package Lesson5;

import java.io.*;

public class Sample7 {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		System.out.println("あなたは男性ですか");
		System.out.println("yまたはnを入力してください");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		char res = str.charAt(0);
		
		if (res == 'Y' || res == 'y') {
			System.out.println("あなたは男性ですね");
		}
		else if (res == 'N' || res == 'n') {
			System.out.println("あなたは女性ですね");
		} 
		else {
			System.out.println("yまたはnを入力してください");
			}
		}
	}