package day0421;

public class VehiclemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motor myCar=new Motor();
		myCar.maxSpeed=160;
		myCar.seater=5;
		myCar.displacement = 1500;
		myCar.printInfo();
	}

}
class Vehicle
{
	public String name="차량";
	public double maxSpeed;
	public int seater;
	
	Vehicle()
	{
		this.name = "자동차";
	}
	
}
class Motor extends Vehicle
{
	public int displacement;

	void printInfo()
	{
		System.out.println("name:"+name);
		System.out.println("최대속도 :"+maxSpeed);
		System.out.println("정원 :"+seater);
		System.out.println("베기량:"+displacement);
	}
}