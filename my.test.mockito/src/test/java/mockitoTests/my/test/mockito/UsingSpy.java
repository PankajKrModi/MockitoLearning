package mockitoTests.my.test.mockito;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class UsingSpy {

	@Test
	public void testSpyWork() {
		List<Integer> mockList = Mockito.spy(new ArrayList<Integer>());
		mockList.add(1);
		mockList.add(2);
		assertEquals(2, mockList.size()); //true
		Mockito.doReturn(10).when(mockList).size();
		assertEquals(10, mockList.size()); //true
		
	}
}
