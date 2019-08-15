package mockitoTests.my.test.mockito;

import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.VerificationCollector;
public class CaptureMultipleFailures {

	@Rule
    public VerificationCollector verificationCollector = MockitoJUnit.collector();
 
	@Test
	public void testMethod() {
		List mockList = Mockito.mock(ArrayList.class);
		//mockList.add("one");
		Mockito.verify(mockList).add("one");
		Mockito.verify(mockList).clear();
	}
}
