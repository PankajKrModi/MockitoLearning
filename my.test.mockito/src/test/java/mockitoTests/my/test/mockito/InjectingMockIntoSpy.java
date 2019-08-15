package mockitoTests.my.test.mockito;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.MockitoAnnotations.Mock;
/**
 * @author pankaj
 *Injecting mock into spy object is supported by constructor and not as usual
 */
public class InjectingMockIntoSpy {

	@Mock
	Map<String,String> map;
	
	MyDict mySpyDict;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
		mySpyDict = Mockito.spy(new MyDict(map)); 
	}
	
	@Test
	public void testMethod() {
		Mockito.doReturn("Run like Cheetah").when(mySpyDict).get("howToRun");
		assertEquals("Run like Cheetah", mySpyDict.get("howToRun"));
	}
}

class MyDict{
	Map<String,String> dictionary;

	public MyDict(Map<String, String> dictionary) {
		super();
		this.dictionary = dictionary;
	}
	public String get(String word) {
		return dictionary.get(word);
	}
	public void add(String word,String meaning) {
		dictionary.put(word, meaning);
	}
}
