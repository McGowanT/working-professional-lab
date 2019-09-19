package professional;
import java.util.ArrayList;

public abstract class Professional 
{
	private int id;
	private String name;
	private float salary;

	private ArrayList<Certification> certifications = new ArrayList<Certification>();

	public Professional(String name) 
	{
		super();
		this.name = name;
	}

	public abstract void addCertification(Certification certifi);

}
