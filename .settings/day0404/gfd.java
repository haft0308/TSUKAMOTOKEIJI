package day0404;

public class gfd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20,c=30; 
		int sum = makeSum(a,b,c);
		System.out.println(sum);
	}
	static int makeSum(int x,int c,int v)
	{
		int f = x+c+v;
		return f;
	}
}
