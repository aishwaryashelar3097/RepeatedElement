
    import java.util.*;
	import java.lang.*;

	class RepeatedElement
	{
	// Function to count the character 'ome'
	static int countChar(String str, char x)
	{
		int count = 0;
		int n = 11;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the string");
		char o = sc.next().charAt(0);
		sc.nextLine();
		for (int i = 0; i < str.length(); i++)
			if (str.charAt(i) == x)
				count++;

		// atleast k repetition are required
		int repetitions = n / str.length();
		count = count * repetitions;

		// if n is not the multiple of the
		// string size check for the remaining
		// repeating character.
		for (int i = 0;
				i < n % str.length(); i++)
		{
			if (str.charAt(i) == x)
				count++;
		}

		return count;
	}

	// Driver code
	public static void main(String args[])
	{
		String str = "ome";
		System.out.println(countChar(str, 'o'));
	}
	}

	



