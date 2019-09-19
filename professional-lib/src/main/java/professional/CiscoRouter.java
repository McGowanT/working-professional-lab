package professional;

public final class CiscoRouter extends Router 
{
	private int ciscoCode;

	public CiscoRouter() 
	{
		ciscoCode = 0;
	}

	public CiscoRouter(int ciscoCode) 
	{
		super();
		this.ciscoCode = ciscoCode;
	}

	@Override
	public void updateDamage(float T) 
	{
		System.out.println("The damage is: " + T);
	}
}
