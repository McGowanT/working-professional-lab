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

	@Override
	public void addCertification(Certification certifi) 
	{
		// TODO Auto-generated method stub

	}

	public boolean fixPipe(Pipe pipe, Tool tool) 
	{
		 System.out.println(" The pipe is being fixed. ");
		 System.out.println("\n");
		 System.out.println(" The appropriate tool is being used. ");
		return true;
	}

}
