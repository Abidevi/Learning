package programs;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome to Oracle";
		str =str.toLowerCase().replace(" ", "");
		int count=0;
		char ch=' ';
		int n=str.length()-1;
		for(int i=0;i<=n;i++)
		{
			for(int j=i+1;j<=n;j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					ch=str.charAt(i);
				   	count++;	
				   	System.out.println(ch +" "+ count);
					str = str.replaceAll(Character.toString(ch)," ");
				}
				else
				{
					ch=str.charAt(i);
					count=1;
					str = str.replaceAll(Character.toString(ch)," ");
				}
			
			}
			System.out.println(ch +" "+ count);
			str = str.replaceAll(Character.toString(ch)," ");
			System.out.println(str);
		}
	}

}
