import org.junit.Assert;

import professional.*;

public class NetworkingProfessionalTest 
{
	NetworkingProfessional net = new NetworkingProfessional();
	
	Tool p = new Pliers();
	Router w = new CiscoRouter();
	
	public void shouldFixRouter()
	{
		boolean fix = net.fixRouter(w, p);
		Assert.assertTrue("Should be able to fix the router", fix);
	}
	
}
