package professional;

public class Pliers extends Tool 
{
	private String colour;

	public Pliers() 
	{
		super(null);
		colour = "";
	}

	public Pliers(String colour) 
	{
		super(null);
		this.colour = colour;
	}

	@Override
	public boolean fix(BreakableItem item) 
	{
		// TODO Auto-generated method stub
		return super.fix(item);
	}

	@Override
	public String toString() {
		return "Pliers [colour=" + colour + "]";
	}


}
