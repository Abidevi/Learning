package programs;

import java.util.HashMap;

public class CountOfEachCharacter 
{		  
		public static void main(String args[])   
		{  
			String str = "Welcome to Oracle"; 
			str =str.toLowerCase().replace(" ", "");
			
			HashMap <Character, Integer> charCount = new HashMap<>();  
			
			for (int i = 0 ; i <= str.length() - 1; i++) 
			{  
				if(charCount.containsKey(str.charAt(i)))   
				{  
					int count = charCount.get(str.charAt(i));  
					charCount.put(str.charAt(i), ++count);  
				}   
				else   
				{  
					charCount.put(str.charAt(i),1);  
				}  
			}  
			System.out.println(charCount); 
		}  		
}
