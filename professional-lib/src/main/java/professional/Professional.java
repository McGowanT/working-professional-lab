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
	
	public int getId()
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public float getSalary() 
	{
		return salary;
	}

	public void setSalary(float salary) 
	{
		this.salary = salary;
	}

	public ArrayList<Certification> getCertifications() 
	{
		return certifications;
	}

	public void setCertifications(ArrayList<Certification> cert) 
	{
		this.certifications = cert;
	}

	public abstract void addCertification(Certification cert);

}
