package professional;
public abstract class Router implements BreakableItem 
{
	@SuppressWarnings("unused")
	private String brand;
	@SuppressWarnings("unused")
	private float bandwidth;

	public Router() 
	{
		brand = "";
		bandwidth = 0.0f;
	}

	public Router(String brand, float bandwidth) 
	{
		super();
		this.brand = brand;
		this.bandwidth = bandwidth;
	}

	public abstract void updateDamage(float T);

	@Override
	public String toString() {
		return "Router [brand=" + brand + ", bandwidth=" + bandwidth + "]";
	}

}
