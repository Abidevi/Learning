package JAVANet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GETRequestExample {
	
	public static void main(String[] args) throws IOException
	{
		URL url =new URL("https://dummy.restapiexample.com/api/v1/employees");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("GET");
		//connection.connect();
		
		int statusCode = connection.getResponseCode();
		System.out.println(statusCode);
		
		String responseMessage = connection.getResponseMessage();
		System.out.println(responseMessage);
		
		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer=new StringBuffer();
		while((line=bufferedReader.readLine())!=null)
		{
			buffer.append(line);			
		}
		System.out.println(buffer);
	}

}
