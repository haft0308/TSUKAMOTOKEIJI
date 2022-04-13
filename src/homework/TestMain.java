package day0413;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test a= new  Test ();
		int [] sum ={1,2,3,4,5,6};
		Test.sum(sum);
		Test.print();
	}

}
class Test
{
	static int total;
static int sum(int c [])
{
	for (int i = 0; i<c.length;i++)
	{
		total+= c[i];
	}return total;
}
static void print()
{
	System.out.println(total);
}
}