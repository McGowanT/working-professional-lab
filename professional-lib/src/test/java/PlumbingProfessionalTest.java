
import org.junit.Assert;

import professional.*;

public class PlumbingProfessionalTest 
{
	PlumbingProfessional plumb = new PlumbingProfessional();
	
	Tool tl = new Wrench();
	Pipe pip = new PvcPipe();
	
	public void shouldFixPipe()
	{
		boolean fixed = plumb.fixPipe(pip, tl);
		Assert.assertTrue("Should be able to fix the pipe", fixed);
	}
}
