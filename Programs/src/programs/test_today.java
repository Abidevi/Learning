package programs;

public class test_today {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="angel";
		String str2="pngle";
		int x=0;
		if(str1.length()==str2.length())
		{
		for(int i=0;i<=str1.length()-1;i++)
		{
			for(int j=0;j<str2.length()-1;j++)
			{
				if(str1.charAt(i)==str2.charAt(j))
				{
					x=1;
				}
				else
				{
					x=0;
				}
			}
		}
		}
		
		if(x==1)
		{
			System.out.println("Strings are anagram");
		}
		else
		{
			System.out.println("Strings are not anagram");
		}

	}

}
