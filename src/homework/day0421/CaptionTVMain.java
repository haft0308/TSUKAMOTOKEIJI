package day0421;

public class CaptionTVMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaptionTv ctv = new CaptionTv();
		ctv.channel=10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("hello,world");
		ctv.caption=true;
		ctv.displayCaption("hello,world");
		ctv.channelDown();
		System.out.println(ctv.channel);
	}

}
class Tv
{
	int channel;
	int channlup;
	int channldown;
	Tv()
	{
		
	}
	void channel(int channl)
	{
		this.channel=channl;
	}
	void channelUp()
	{
		channel++;
		System.out.println(channlup);
	
	}
	void channelDown()
	{
		channel-=1;
		channel--;
		System.out.println(channldown);
	}
}
class CaptionTv extends Tv
{
	boolean caption;
	
	void displayCaption(String text)
	{
		if (caption)
			System.out.println(text);
	}
}
