package lesson150310;

public class POJO { // Plain Old Java Object, often immutable
	// Java Bean
	// with property "index"
	
	int i;
	
	public POJO (int i)
	{
		this.i = i;
	}
	
	public void setI (int i)
	{
		this.i = i;
	}
	
	public int getI ()
	{
		return i;
	}
}
