package mockitoTests.my.test.mockito;

import java.util.AbstractList;

import org.junit.Test;
import org.mockito.Mockito;

public class MockitoVoidMethod {

	@Test(expected = ArithmeticException.class)
	public void testExceptionThrow() {
		MyList1 list = Mockito.mock(MyList1.class);
		Mockito.doThrow(ArithmeticException.class).when(list).add(Mockito.anyInt(), (String)Mockito.isNull());
		list.add(1, null);
	}
}

class MyList1 extends AbstractList<String>{

	public void add(int index, String element) {
		if(element.equals(null)) throw new ArithmeticException();
	}
	
	@Override
	public String get(int index) {
		return null;
	}

	@Override
	public int size() {
		return 0;
	}
	
}
