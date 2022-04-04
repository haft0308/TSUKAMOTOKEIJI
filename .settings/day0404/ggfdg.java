package day0404;

public class ggfdg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = compute(4);
		System.out.println(result);
	}
	static int compute(int x)
	{
		int ret = 0;
		
		if(x==1)
		{
			ret=1;
		}
		else 
		{
			ret=x*(compute(x-1));
		}
		System.out.println(ret);
		return ret;
	}
}
