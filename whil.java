package d0322;

import java.util.Scanner;

public class whil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int i =0;
		int b =0;
		while (i<=10)
		{
			System.out.println("1~10사이의 숫자를 입력하세요. 0을 입력하면 종료합니다.");
			i = sc.nextInt();
			++b;
			if (i==0)
			{
				break;
			}
		
		}
		System.out.println("입력받은 횟수"+--b);
	}
	
}
