
public abstract class Pipe implements BreakableItem 
{
	protected float length;
	protected float diameter;

	public Pipe() 
	{
		length = 0.0f;
		diameter = 0.0f;
	}

	public Pipe(float length, float diameter) 
	{
		super();
		this.length = length;
		this.diameter = diameter;
	}

	public abstract void updateDamage(float T);

}
