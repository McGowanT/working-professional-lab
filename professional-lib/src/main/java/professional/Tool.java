package professional;
public class Tool 
{
	@SuppressWarnings("unused")
	private String brand;

	public Tool(String brand) 
	{
		super();
		this.brand = brand;
	}

	public boolean fix(BreakableItem item) 
	{
		return true;
	}
}
