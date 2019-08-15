package mockitoTests.my.test.mockito;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class ArgMatcher {

	@Test
	public void testArg() {
		FlowerService mocked = Mockito.mock(FlowerService.class);
		Mockito.doReturn(true).when(mocked).isABigFlower(Mockito.eq("ddd"), Mockito.anyInt());/*
		either all the argument is arg matcher or all values should be raw
		ant matcher not used outside stubbing or verify method 
		*/
		
		boolean res = mocked.isABigFlower("ddd", 1);
		assertEquals(true, res);
	}
}

abstract class FlowerService {
    public abstract boolean isABigFlower(String name, int petals);
}
