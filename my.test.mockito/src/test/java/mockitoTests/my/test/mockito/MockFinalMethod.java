package mockitoTests.my.test.mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class MockFinalMethod {

	Xyz list ;
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
		list = new Xyz();
	}
	
	@Test
	public void testFinalMethod() {
		
		Xyz mockList = Mockito.mock(Xyz.class);
		Mockito.doReturn(1).when(mockList).finalMethod();
		assertNotEquals(mockList.finalMethod(), list.finalMethod());
	}
}

class Xyz{

	public int finalMethod() {
		return 0;
	}	
}
