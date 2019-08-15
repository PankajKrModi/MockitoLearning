package mockitoTests.my.test.mockito;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

//doCallRealM
public class App1 {
	
	@Test
	public void testVerify() {
		List<Integer> mockList = Mockito.mock(ArrayList.class);
		mockList.add(1);// we are stubbing not actually adding in List
		mockList.add(1);
		Mockito.verify(mockList, Mockito.times(2)).add(1);
		System.out.println(mockList.size());
		assertEquals(0, mockList.size()); //returns True
		Mockito.doReturn(10).when(mockList).size();// stubbing
		assertEquals(10, mockList.size());
	}


}
