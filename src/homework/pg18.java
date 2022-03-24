package day0324;

public class pg18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nu=new int[6];
		int b = 0;
		for (int i=0; i<nu.length; i++)
		{
			//nu[i]=nu[i]+b+10;
			//b=nu[i];
			b+=10;
			nu[i]=b;
			System.out.println(nu[i]);
		}
			
	}

}
