
public class ReverseString {
	
	public String reverseIterative(String input)
    {
		char[] charArray = new char[input.length()];
        String reversed = "";
        
        for(int i = input.length() - 1; i >= 0; i--)
        {
            charArray[i] = input.charAt(i);
            reversed += charArray[i];
        }
        return reversed;
    }
	
	public String reverseRecursive(String input){
        // Return the new input when at last element.
        if(input.length() <= 1)
        {
            return input;
        }
        // Recursive method call
        // Remove the first element and add first element to the end of the string
        // Add and remove elements at the same call
        return reverseRecursive(input.substring(1)) + input.charAt(0);
    }

}
