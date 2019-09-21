package ProfessionalTest;

import org.junit.Assert;
import org.junit.Test;

import professional.*;


public class PlumbingProfessionalTest 
{
	PlumbingProfessional plumb = new PlumbingProfessional();
	
	Tool tl = new Wrench();
	Pipe pip = new PvcPipe();
	
	@Test
	public void shouldFixPipe()
	{
		boolean fixed = plumb.fixPipe(pip, tl);
		Assert.assertTrue("Should be able to fix the pipe", fixed);
	}
}
