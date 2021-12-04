package week1.day2;

public class CharacterOccurance {

	public static void main(String[] args) {
		// Check number of occurrences of a char (eg 'e') in a String
		
					

					// declare and initialize a variable count to store the number of occurrences
					// convert the string into char array
						
					//get the length of the array
						
					// traverse from 0 till the array length 
						
						// Check the char array has the particular char in it 
					
						// if is has increment the count
							 
						// print the count out of the loop
		String str = "welcome to chennai";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char str2=str.charAt(i);
			if(str2=='e')
			{
				count++;
				
			}
			
			
		}
		System.out.println("The occurance of e is " +count);
	}

}
