
public class NetworkingProfessional extends Professional 
implements INetworkingProfessional 
{

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
		// TODO Auto-generated method stub
		return false;
	}

}
