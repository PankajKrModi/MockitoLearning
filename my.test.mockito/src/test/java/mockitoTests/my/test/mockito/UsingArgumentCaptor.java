package mockitoTests.my.test.mockito;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

public class UsingArgumentCaptor {

	@Test
	public void testCaptor() {
		People people = Mockito.mock(People.class);
		new Name().setPeopleName(people);
		
		ArgumentCaptor<String> argCaptor = ArgumentCaptor.forClass(String.class);
		Mockito.verify(people).setName(argCaptor.capture());
		
		String actualName = argCaptor.getValue();
		assertEquals("Ashish", actualName);
	}
}

class Name{
	public void setPeopleName(People people) {
		String name = new String("Ashish");
		people.setName(name);
	}
}
class People{
	String name;
	public void setName(String str){
		name=str;
	}
}