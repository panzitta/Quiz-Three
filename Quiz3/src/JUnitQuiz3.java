import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import quiz3Exceptions.SideException;

public class JUnitQuiz3 {
		
	@Before
	public void BeforeClass() throws SideException{
	}
	
	@After
	public void AfterClass() throws SideException{
	}
	
	@Test
	public void testArea() {
		double area = new Triangle(1, 1, 1).getArea();
		double test=Math.sqrt(1.5*(1.5-1)*(1.5-1)*(1.5-1));
		assertTrue(area==test);
		}
	
	@Test
	public void testPerimeter(){
		double perimeter = new Triangle(1,1,1).getPerimeter();
		assertTrue(perimeter==3);
	}
}
