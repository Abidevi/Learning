package JAVANet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class POSTRequestExample {
	
	public void postRequestExample() throws IOException
	{
		URL url =new URL("https://dummy.restapiexample.com/api/v1/create");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);		
		String jsonBody="{\"name\":\"test\",\"salary\":\"123\",\"age\":\"23\"}";  //Escaping the string
		byte[] inputJson=jsonBody.getBytes();
		OutputStream outputStream = connection.getOutputStream();
		outputStream.write(inputJson);		
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
	
	public static void main(String[] args) throws IOException
	{
		POSTRequestExample post=new POSTRequestExample();
		post.postRequestExample();
	}


}
