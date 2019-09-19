package professional;

public class Pliers extends Tool 
{
	private String colour;

	public Pliers() 
	{
		super("tool");
		colour = "";
	}

	public Pliers(String colour) 
	{
		super("tool");
		this.colour = colour;
	}

	@Override
	public boolean fix(BreakableItem item) 
	{
		// TODO Auto-generated method stub
		return super.fix(item);
	}

}
