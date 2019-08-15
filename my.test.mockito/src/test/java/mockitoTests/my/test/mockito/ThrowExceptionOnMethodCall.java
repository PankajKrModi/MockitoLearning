package mockitoTests.my.test.mockito;

import org.hamcrest.core.IsEqual;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;

import org.junit.Test;
import org.mockito.Mockito;

public class ThrowExceptionOnMethodCall {
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void checkException() {
		MyList list = Mockito.mock(MyList.class);
		Mockito.doThrow(ArrayIndexOutOfBoundsException.class).when(list).getIndexValue(Mockito.anyInt());
		list.getIndexValue(10);
		//Answer
		Mockito.doAnswer(invocation -> "Same").when(list).get(Mockito.anyInt());
		String val = list.get(10);
		assertEquals(val, "Same");
	}
}

class MyList extends ArrayList<String>{

	MyList list = new MyList();
	public void getIndexValue(int i) throws ArrayIndexOutOfBoundsException{
		
		throw new ArrayIndexOutOfBoundsException();
	
	}
}
