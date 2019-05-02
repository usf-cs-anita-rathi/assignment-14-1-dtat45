
public class Handshake 
{
	public int shakeHands(int p)
	{
		if(p==1)
			return 0;
		else
			return (p-1)+shakeHands(p-1);
	}
	
	public static void main(String args[])
	{
		Handshake shake=new Handshake();
		System.out.print("Number of handshakes for 2 people: ");
		System.out.println(shake.shakeHands(2));
		System.out.print("Number of handshakes for 10 people: ");
		System.out.println(shake.shakeHands(10));
	}
}
