import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void reverseIterative() {
		ReverseString checkString = new ReverseString();
		
		// Test single word string
		String output = checkString.reverseIterative("Hello");
		String answer = "olleH";
		
		// Test strings with spaces
		String output1 = checkString.reverseIterative("Hello World");
		String answer1 = "dlroW olleH";
		
		// Test string with single character
		String output2 = checkString.reverseIterative("a");
		String answer2 = "a";
		
		// Test numbers in string
		String output3 = checkString.reverseIterative("1233");
		String answer3 = "3321";
		
		// Test Empty String
		String output4 = checkString.reverseIterative("");
		String answer4 = "";
		
		assertEquals(answer, output);
		assertEquals(answer1, output1);
		assertEquals(answer2, output2);
		assertEquals(answer3, output3);
		assertEquals(answer4, output4);
		
	}
	
	@Test
	public void reverseRecursive() {
		ReverseString checkString = new ReverseString();
		
		// Test single word string
		String output = checkString.reverseRecursive("Hello");
		String answer = "olleH";
		
		// Test strings with spaces
		String output1 = checkString.reverseRecursive("Hello World");
		String answer1 = "dlroW olleH";
		
		// Test string with single character
		String output2 = checkString.reverseRecursive("a");
		String answer2 = "a";
		
		// Test numbers in string
		String output3 = checkString.reverseRecursive("1233");
		String answer3 = "3321";
		
		// Test Empty String
		String output4 = checkString.reverseRecursive("");
		String answer4 = "";
		
		assertEquals(answer, output);
		assertEquals(answer1, output1);
		assertEquals(answer2, output2);
		assertEquals(answer3, output3);
		assertEquals(answer4, output4);
		
	}

}
