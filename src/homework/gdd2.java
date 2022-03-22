package d0322;

import java.util.Scanner;

public class gdd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println("구구단을 입력");
		for(int j=1; j<=9;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
	}

}

