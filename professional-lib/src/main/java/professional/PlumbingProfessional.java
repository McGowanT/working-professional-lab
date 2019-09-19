package professional;

public class PlumbingProfessional extends Professional 
implements IPlumbingProfessional 
{

	public PlumbingProfessional()
	{
		super(null);
	}
	
	public PlumbingProfessional(String name) 
	{
		super(name);
		// TODO Auto-generated constructor stub
	}

	public boolean fixPipe() 
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addCertification(Certification certifi) 
	{
		// TODO Auto-generated method stub

	}

	public boolean fixPipe(Pipe pipe, Tool tool) 
	{
		// TODO Auto-generated method stub
		return false;
	}

}
