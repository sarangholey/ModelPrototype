package Assignment_4;

public class Shark extends Fish{

	public Shark() {
		System.out.println("I like to bite");
	}
	
	@Override
	public void greeting()
	{
		System.out.println("I like to hunt");
	}
	
	public void length()
	{
		System.out.println("My average length is 3.3 meters");
	}
	
	public void colour()
	{
		System.out.println("I am having slate or blue in colour");
	}
}
