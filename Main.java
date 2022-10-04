
public class Main {
	
	public static void main(String[] args)
    {
        // Find most common integer in an array
        int[] array = {1,2,3,2,3,4,2};

        MostFrequentInteger checkArray = new MostFrequentInteger();
        int mostFrequent =  checkArray.getMostFrequent(array);

        System.out.println("The most frequent integer is: " + mostFrequent);

        // Reverse Strings Iteratively and Recursively
        ReverseString checkString = new ReverseString();
        String reverseString = "Hello World!";

        String iterativeReverse = checkString.reverseIterative(reverseString);
        System.out.println(reverseString + " reversed iteratively is: " + iterativeReverse);

        String recursiveReverse = checkString.reverseRecursive(reverseString);
        System.out.println(reverseString + " reversed recursively is: " + recursiveReverse);
        
    }

}
