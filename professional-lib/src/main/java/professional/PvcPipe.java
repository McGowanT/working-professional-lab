package professional;

public class PvcPipe extends Pipe 
{
	@SuppressWarnings("unused")
	private String colour;

	public PvcPipe() 
	{
		colour = "";
	}

	public PvcPipe(String colour) 
	{
		super();
		this.colour = colour;
	}

	public void updateDamage(float T)
	{
		System.out.println("This pipe is damaged.");
	}
}
