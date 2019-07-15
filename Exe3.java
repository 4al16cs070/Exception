package pac;

public class Exe3 {
	void m1() throws Exception
	{
		throw new Exception("pooja exception");
	}
}
class Excp3
{
	void m2() throws Exception
	{
		Exe3 e=new Exe3();
		e.m1();
	}
}
