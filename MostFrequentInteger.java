
public class MostFrequentInteger { 
	
	public int getMostFrequent(int[] input)
    {
		// Check array for values
        if(input.length == 0)
        {
            System.out.println("Array contains no elements");
            return 0;
        }

        int mostFrequentCounter = 0;
        int mostFrequentInt = input[0];

        for (int i=0;i<input.length-1;i++)
        {
            int count = 0;
            for (int j=1;j<input.length;j++)
            {
            	// Check for matches
                if (input[i] == input[j]) {
                    count++;
                }
            }
            
            // Check for new frequent
            if (count > mostFrequentCounter)
            {
                mostFrequentInt = input[i];
                mostFrequentCounter = count;
            }
        }
        return mostFrequentInt;
    }
}
