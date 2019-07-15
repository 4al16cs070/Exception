package pac;

public class Exe {
	public static void main(String[] args) {
		
		try
		{
			int x=10;
			int y=0;
			System.out.println(x/y);
		}
		catch(Exception e)
		{
			System.out.println("handeling code");
			int x=10;
			int y=20;
				System.out.println(x+y);
		}
		
		finally {
			System.out.println("i got lost");
			System.out.println(10/0);
		}
	} 
}
