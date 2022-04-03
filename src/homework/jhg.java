package dat0401;

public class jhg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {1,2,3,4,5};
		int  max =0;
		int sum = 0;
		float avg = 0.0f;
		
		max = makeMax(arr1);
		System.out.println(max);
		
		sum = makeSum(arr1);
		System.out.println(sum);
		
		avg = makeAng(arr1);
		System.out.println(avg);
	}
	static int makeMax(int[] v)//가장 큰값
	{
		int b =0;
		for(int i =0; i<v.length;i++)
		{
			if(b<v[i])
			{
				b=v[i];
			}
		}return b;
		
	}
	static int makeSum(int[] a)//더하기
	{
				int y =0;
		for (int i = 0; i<a.length;i++)
		{
				a[i]+=y;
				y=a[i];
			
		}
		return y;
	}
	
	static float makeAng(int[] n)//평균
	{
		float q =0;	
		for (int i=0; i<n.length;i++)
		{
			n[i]+=q;
			q=n[i];
			
		}
		return q/5; 
	}	
}
