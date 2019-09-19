
public class Wrench extends Tool 
{
	private float size;

	public Wrench() 
	{
		super("tool");
		size = 0.0f;
	}

	public Wrench(float size) 
	{
		super("tool");
		this.size = size;
	}

	@Override
	public boolean fix(BreakableItem item) 
	{
		// TODO Auto-generated method stub
		return super.fix(item);
	}

}
