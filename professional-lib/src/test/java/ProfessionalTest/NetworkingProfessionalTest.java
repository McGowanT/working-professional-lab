package ProfessionalTest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import professional.*;


public class NetworkingProfessionalTest 
{
	NetworkingProfessional net = new NetworkingProfessional();
	
	Tool p = new Pliers();
	Router w = new CiscoRouter();
	
	@Test
	public void shouldFixRouter()
	{
		boolean fix = net.fixRouter(w, p);
		assertTrue("Should be able to fix router", fix);
	}
	
}
