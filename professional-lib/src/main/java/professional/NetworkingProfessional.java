package professional;

public class NetworkingProfessional extends Professional 
implements INetworkingProfessional 
{
	public NetworkingProfessional()
	{
		super(null);
	}
	
	public NetworkingProfessional(String name) 
	{
		super(name);
		System.out.println("My name is" + name);
	}

	@Override
	public void addCertification(Certification certifi) 
	{
		System.out.println("I have these certifications " + certifi);
	}

	public boolean fixRouter(Router rout, Tool tool) 
	{
	   
		System.out.println(" The router is being fixed. ");
	    System.out.println("\n");
	    System.out.println(" The appropriate tool is being used. ");
	    return true;
	}

}
