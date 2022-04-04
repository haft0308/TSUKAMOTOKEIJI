package day0404;

public class gdfg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr2= {10,20,30,45,48,16,89,77,59,100};
		int sum =0;
		int max =0;
		float avg = 0.0f;
		
		sum = makeSum(arr2);
		System.out.println(sum);
		
		max = makeMax(arr2);
		System.out.println(max);
		
		avg = makeAvg(arr2);
		System.out.println(avg);
		
		int [] answer = reverse(arr2);
		for(int i=0; i<10; i++)
		{
			System.out.println(answer[i]);
		}
	}
	static int makeSum(int[]x)
	{
		int b= 0;
		for(int i=0; i<x.length;i++)
		{
			b+=x[i];
			
		}
		return b;
	}
	static int makeMax(int[]c)
	{
		int g=0;
		for(int i=0; i<c.length;i++)
		{
			if(g<c[i])
			{
				g=c[i];
			}
			
		}return g;
	}
	static float makeAvg(int []h)
	{
		//float q=0;
		//for (int i=0; i<h.length;i++)
		//{
		//q+=h[i];	
		int sum = makeSum(h);
		float avg = sum/10.0f;
		return avg;
			
			
			
		
		//return q/10;
		
	}
	static int[] reverse(int[]arr2)
	{
		int[] arr3=new int [10];
		
		for (int i=0; i<10; i++)
		{
			arr3[i] = arr2[9-1];
		}
		return arr3;
	}
}
