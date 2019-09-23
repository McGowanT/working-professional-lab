package professional;

public class Wrench extends Tool 
{
	private float size;

	public Wrench() 
	{
		super(null);
		size = 0.0f;
	}

	public Wrench(float size) 
	{
		super(null);
		this.size = size;
	}

	@Override
	public boolean fix(BreakableItem item) 
	{
		// TODO Auto-generated method stub
		return super.fix(item);
	}

	@Override
	public String toString() {
		return "Wrench [size=" + size + "]";
	}

	
}
