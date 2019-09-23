import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import professional.*;

public class Driver 
{
	static Scanner n = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		ArrayList <Tool> t = new ArrayList <Tool> ();
		Pliers p = new Pliers("Maroon");
		t.add(p);
		Wrench w = new Wrench (3.1f);
		t.add(w);
		Pliers p1 = new Pliers ("Blue");
		t.add(p1);
		Wrench w1 = new Wrench (4.2f);
		t.add(w1);
		Pliers p2 = new Pliers("Yellow");
		t.add(p2);
		
	
		System.out.println("The tools collected include: " + "\n \n" + t.toString());
		
		/***********/
		
		
		Professional prof;
		
		String nam;
  
		do {
				System.out.println("\n" + " Kindly, enter your professional type: \n ");
				nam = n.nextLine();
				
				String N = "Networking Professional";
				String P = "Plumbing Professional";
				
						switch(nam)
						{
						  case "Networking Professional":
							  prof = new NetworkingProfessional();
							  System.out.println("\n You are a networking professional");
							  detailP(prof);
							  break;
							  
						  case "Plumbing Professional":
							   prof = new PlumbingProfessional();
							   System.out.println("\n You are a plumbing professional");
							   detailP(prof);
							   break;
							   
						  default:
							  System.out.println("\n Kindly, enter a valid professional type.");
							  
						}
						
						if(nam.compareToIgnoreCase("N")==0)
						{

							NetworkingProfessional profN = new NetworkingProfessional(); 
							CiscoRouter breakI = new CiscoRouter();

							detailP(profN);
							profN.fixRouter(breakI, p);
							breakI.updateDamage(9.2f);
							
						}else if(nam.compareToIgnoreCase("P")==0) 
								{
		
									PlumbingProfessional profP = new PlumbingProfessional();
									PvcPipe item = new PvcPipe();
		
									detailP(profP);
									profP.fixPipe(item, w);
									item.updateDamage(8);
								}
							System.out.println("Amazing work");
					    
		  }while(nam != "P");
		  
    }
		
		public static void detailP(Professional prof)
		{
			Certification cert = new Certification();
	
			System.out.println("\n What is your name?");
			String profess = n.nextLine();
			prof.setName(profess);
	
			System.out.println("\n What is your ID number?");
			int id = n.nextInt();
			prof.setId(id);
			
			System.out.println("\n What is your salary?");
			int salary = n.nextInt();
			prof.setSalary(salary);
			
			System.out.println("\n What many certifications do you have?");
			int cNum = n.nextInt();
			cert.setNumber(cNum);
			
			System.out.println("\n What are you certified in?");
			String cAdd = n.next();
			cert.setName(cAdd);
			prof.addCertification(cert);
			
		}
}